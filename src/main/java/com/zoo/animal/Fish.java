package com.zoo.animal;

public class Fish extends Animal {
    public Fish(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
    }
    @Override
    public void move() {
        System.out.println("Рыба плавает");
    }
    @Override
    public void say() throws Exception {
        System.out.println("Рыбы молчат");
    }
}
