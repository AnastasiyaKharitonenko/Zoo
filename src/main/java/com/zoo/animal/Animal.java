package com.zoo.animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Animal implements Breathing, Eatable {
    private String name;
    private int age;
    private String colour;
    private double weight;
    private boolean homeAmimal = false;

    public Animal() {
    }

    public Animal(String name, int age, String colour, double weight) throws Exception {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        this.name = name;
    }
    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) throws Exception {
        this.age = age;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Double.compare(animal.weight, weight) == 0 &&
                Objects.equals(name, animal.name) &&
                Objects.equals(colour, animal.colour);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour, weight);
    }

    public abstract void say() throws Exception, IllegalArgumentException;

    public abstract void move();

    public String toKnowWeight(String string) {
        System.out.println("Животное имеет вес");
        return string;
    }
    public String toKnowWeight(String string, int hours) {
        System.out.println(" Животное весит " + weight);
        return string;
    }
    public void animalIsHome() {
        homeAmimal = true;
    }
    public void isAmimalHome() {
        if (homeAmimal) {
            System.out.println("очень домашнее");
        } else {
            System.out.println("не домашнее");
        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                ", homeAmimal=" + homeAmimal +
                '}';
    }
}
