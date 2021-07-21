package com;

import com.zoo.animal.*;
import com.zoo.animal.Mussels;

public class Person {

    public void toEat(Animal animal, String food) throws FoodException {
        if (food.equalsIgnoreCase("мясо")) {
            throw new FoodException("Это животное нельзя кормить мясом!");
        }
    }
    public void toPlay(Mussels mussels, String game) throws GameException {
        if (game.equalsIgnoreCase("мяч")){
            throw new GameException("Моллюски не играют в мяч");
        }
    }
}
