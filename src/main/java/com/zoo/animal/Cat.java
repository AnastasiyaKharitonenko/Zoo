package com.zoo.animal;

public class Cat extends Animal {


    public Cat() {
        super();
    }

    public Cat(String name, int age, String colour, double weight) throws Exception {
        super(name, age, colour, weight);
        if (age <= 0) {
            throw new Exception();
        }
    }

    @Override
    public void say() throws Exception, IllegalArgumentException {
        System.out.println("Кот мурчит");

    }

    @Override
    public void move() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void setAge(int age) throws Exception {
        super.setAge(age);
        if (age <= 0) {
            throw new Exception("Возраст кота не может быть отрицательным");
        }
    }


}
