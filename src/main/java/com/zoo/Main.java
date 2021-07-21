package com.zoo;

import com.zoo.animal.*;
import com.*;

import java.io.IOException;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Cat cat = new Cat("Барсик", 5, "серый", 12.5);
        Cat cat2 = new Cat("Васька", 5, "серый", 12.5);
        Dog dog = new Dog("Чарли", 15, "черный", 15.3);
        Parrot parrot = new Parrot("Кеша", 2, "зеленый", 0.125);
        Fish fish = new Fish("Золотая рыбка", 4, "золотой", 0.100);
        Crocodile crocodile = new Crocodile("Гена", 54, "зеленый", 100.5);
        Cow cow = new Cow("Дуся", 5, "белый", 89.4);
        Mussels mussels = new Mussels("Жемчужинка", 8, "серый", 0.100);

        Person person = new Person();


        List<Aviary> listAviary = new ArrayList<>(2); // Создаем зоопарк (массив вольеров)
//        ZooAviaries listAviary = new ZooAviaries(2);
//        System.out.println("000000000000");
//        listAviary.get(0);
        listAviary.add(new Aviary(3)); // создаем первый вольер
        listAviary.get(0).addAnimal(new Cat("Рыжик", 2, "белый", 2.4));
        listAviary.get(0).addAnimal(new Dog("Черныш", 5, "черный", 4.5));
        listAviary.get(0).addAnimal(new Dog("Черныш", 5, "черный", 4.5));
        listAviary.get(0).addAnimal(new Crocodile("Геннадий", 9, "Хакки", 30));
        listAviary.get(0).addAnimal(new Cat()); // Добавляем какое-то животное, чтобы добавить
        listAviary.get(0).removeAnimal(4); // Пытаемся удалить не существующее животное
        listAviary.get(0).removeAnimal(-4); // Пытаемся удалить животное под отрицательным индексом
        listAviary.get(0).removeAnimal(1); // Удаляем собаку по кличке Черныш, потому что ее съел крокодил Геннадий :)

        listAviary.add(new Aviary(2)); // Создаем второй вольер
        listAviary.get(1).addAnimal(new Cow("Мурка", 5, "Черно-белая", 250));
        listAviary.get(1).addAnimal(new Cow("Буренка", 7, "желтая в цветочек", 320));

        System.out.println(listAviary.get(0).toString());
        System.out.println(listAviary.get(1).toString());

        System.out.println(" Кота зовут " + cat.getName() + "\n Собаку зовут " + dog.getName() + "\n Попугая зовут " + parrot.getName() + "\n Рыбку зовут " + cat.getName() + "\n Крокодила зовут " + crocodile.getName() + "\n Корову зовут " + cow.getName() + "\n Мидий зовут " + mussels.getName());
        System.out.println();

        Eatable.eat();
        Breathing.breath();

        System.out.println(cat.toKnowWeight("Кот весит " + 3 + " кг"));

        cat.animalIsHome(); // Определяем кота как домашнее животное
        System.out.print("Кот животное ");
        cat.isAmimalHome(); // Запрашиваем статус домашнести кота


        try {
            cat.setAge(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            dog.setName(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            person.toEat(dog, "Мясо");
        } catch (FoodException e) {
            e.printStackTrace();
        }

        try {
            person.toPlay(mussels, "Мяч");
        } catch (GameException e) {
            e.printStackTrace();
        }


    }
}
