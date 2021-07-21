package com.zoo.animal;

public class Crocodile extends Animal {
    public Crocodile(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        System.out.println("Крокодил плавает и ползает");
    }
    @Override
    public void say() throws Exception {
        System.out.println("Крокодил молчит");
    }
}

