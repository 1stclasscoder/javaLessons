package exercise6;

public class User {
    private final boolean priority;
    private final int number;

    User(boolean priority, int number) {
        this.priority = priority;
        this.number = number;
    }

    public boolean isPriority() {
        return priority;
    }

    public int getNumber() {
        return number;
    }
}
