package com.zoo.animal;

import java.util.ArrayList;
import java.util.List;

import com.OutOfAviaryCapacityException;


public class Aviary {
    private List list2;
    private int aviaryCapacity;

    public Aviary(int aviaryCapacity) {
        this.aviaryCapacity = aviaryCapacity;
        List<Animal> list2 = new ArrayList<>(aviaryCapacity);
        this.list2 = list2;
    }

    public void addAnimal(Animal animal) {

        try {
            if (this.list2.size() < aviaryCapacity) {
                int isTheSameInAviary = 0;
                for (Object animalInAviary : this.list2) {
                    if (!animalInAviary.equals(animal)) {
                        continue;
                    } else {
                        isTheSameInAviary = 1;
                    }
                }
                if (isTheSameInAviary != 1) {
                    this.list2.add(animal);
                } else {
                    throw new Exception("Такое животное уже есть в вольере");
                }

            } else {
                throw new OutOfAviaryCapacityException("Вольер полон");
            }
        } catch (OutOfAviaryCapacityException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void removeAnimal(int indexOfAnimal) {
        try {
            if (indexOfAnimal < 0) {
                throw new IndexOutOfBoundsException("Индекс животного не может быть отрицательным числом");
            } else if (indexOfAnimal >= this.list2.size()) {
                throw new IndexOutOfBoundsException("Индекс за пределами массива");
            } else {
                System.out.println("Из вольера удалено следующее животное " + this.list2.get(indexOfAnimal));
                this.list2.remove(indexOfAnimal);
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "list2=" + list2 +
                '}';
    }
}

