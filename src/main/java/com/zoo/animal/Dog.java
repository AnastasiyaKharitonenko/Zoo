package com.zoo.animal;

public class Dog extends Animal {

    public Dog(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
    }

    @Override
    public void move() {
        System.out.println("Собака быстро бегает");
    }
    @Override
    public void setName(String name) throws Exception {
        super.setName(name);
        if (name == null) {
            throw new Exception("У собаки должна быть кличка");
        }
    }
    @Override
    public void say() throws Exception {
        System.out.println("Собака лает");
    }
}

