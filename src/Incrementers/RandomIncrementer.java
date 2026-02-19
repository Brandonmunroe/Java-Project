package Incrementers;

import java.util.Random;

public class RandomIncrementer implements Incrementable {

    private int value;
    private Random rand;

    public RandomIncrementer() {
        rand = new Random();
        value = rand.nextInt();
    }

    @Override
    public void increment() {
        value = rand.nextInt();
    }

    @Override
    public int getValue() {
        return value;
    }
}
