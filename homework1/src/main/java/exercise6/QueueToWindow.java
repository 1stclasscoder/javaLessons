package exercise6;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueToWindow {
    PriorityBlockingQueue<User> queue = new PriorityBlockingQueue<>(50,
            Comparator.comparing(User::isPriority, Comparator.reverseOrder()));

    public synchronized void addUser(User user) {
        queue.add(user);
    }

    public synchronized User takeUser() {
        return Objects.requireNonNull(queue.poll());
    }
}
