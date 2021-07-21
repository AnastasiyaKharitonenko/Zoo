package com.zoo.animal;

public class Parrot extends Animal {
    public Parrot(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        System.out.println("Попугай летает");
    }
    @Override
    public void say() throws Exception {
        System.out.println("Попугай разговаривает");
    }
}
