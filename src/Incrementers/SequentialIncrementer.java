package Incrementers;

public class SequentialIncrementer implements Incrementable {

    private int value;

    public SequentialIncrementer() {
        value = 0;
    }

    @Override
    public void increment() {
        value = value + 1;
    }

    @Override
    public int getValue() {
        return value;
    }
}
