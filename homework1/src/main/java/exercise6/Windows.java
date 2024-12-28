package exercise6;

import java.util.concurrent.TimeUnit;

public class Windows extends Thread {
    boolean window1 = true;
    boolean window2 = true;
    boolean window3 = true;
    int countUsers = 1;
    QueueToWindow queue = new QueueToWindow();

    private void window1 () {
        printReception(1);
        sleepForSometime(12);
        releaseWindow(1);
    }

    private void window2() {
        printReception(2);
        sleepForSometime(10);
        releaseWindow(2);
    }

    private void window3() {
        printReception(3);
        sleepForSometime(15);
        releaseWindow(3);
    }

    public void addUser(boolean priority) {
        queue.addUser(new User(priority, countUsers));
        countUsers++;
        chooseWindow();
        sleepForSometime(1);
    }

    private void chooseWindow() {
        Runnable task = new Runnable() {
            public void run() {
                boolean status = true;
                while (status) {
                    if (tryAcquireWindow(1)) {
                        window1();
                        status = false;
                    } else if (tryAcquireWindow(2)) {
                        window2();
                        status = false;
                    } else if (tryAcquireWindow(3)) {
                        window3();
                        status = false;
                    }
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    private synchronized boolean tryAcquireWindow(int windowNumber) {
        if (windowNumber == 1 && window1) {
            window1 = false;
            return true;
        } else if (windowNumber == 2 && window2) {
            window2 = false;
            return true;
        } else if (windowNumber == 3 && window3) {
            window3 = false;
            return true;
        }
        return false;
    }

    private synchronized void releaseWindow(int windowNumber) {
        if (windowNumber == 1) window1 = true;
        else if (windowNumber == 2) window2 = true;
        else if (windowNumber == 3) window3 = true;
    }

    private static void sleepForSometime(long time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void printReception(int numberWindow) {
        User bufUser =  queue.takeUser();
        String priority = bufUser.isPriority() ? " c приоритетностью" : " без приоритетности";
        System.out.println("Прием посетитяля № " + bufUser.getNumber() + priority + " в окне " + numberWindow);
    }
}
