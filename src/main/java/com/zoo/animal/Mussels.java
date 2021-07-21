package com.zoo.animal;

public class Mussels extends Animal {
    public Mussels(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        System.out.println("Мидии плавают");
    }

    @Override
    public void say() throws Exception {
        System.out.println("Мидии молчат");
    }
}

