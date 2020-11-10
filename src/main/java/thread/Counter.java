package thread;

public class Counter {
    private static final int END_NUMBER = 100;
    private int value;

    public void plusOne() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public boolean isNotEnd() {
        return value != END_NUMBER;
    }
}
