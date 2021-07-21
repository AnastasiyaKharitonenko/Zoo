package com.zoo.animal;

public class Cow extends Animal {

    public Cow(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
    }
    @Override
    public void move() {
        System.out.println("Корова ходит");
    }
    @Override
    public void say() throws Exception {
        System.out.println("Корова говорит мууууу");
    }
}
