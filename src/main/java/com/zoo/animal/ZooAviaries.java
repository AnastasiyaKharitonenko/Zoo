package com.zoo.animal;

import java.util.ArrayList;
import java.util.List;

public class ZooAviaries {
    List listAviary;
    int zooCapacity; // Вместимость (количество вольеров) зоопарка

    public ZooAviaries(int zooCapacity) {
        this.zooCapacity = zooCapacity;
        List<Aviary> listAviary = new ArrayList<>(zooCapacity);
        this.listAviary = listAviary;
    }


    public List get (int indexOfAviary) throws IndexOutOfBoundsException {
        System.out.println("111111111");
        try {
            if (indexOfAviary < listAviary.size() && indexOfAviary >= 0) {
                System.out.println("222222222222");
                return (List) listAviary.get(indexOfAviary);
            } else {
                System.out.println("33333333333");
                throw new IndexOutOfBoundsException("Неправильный индекс вольера");
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return null;
    }



}
