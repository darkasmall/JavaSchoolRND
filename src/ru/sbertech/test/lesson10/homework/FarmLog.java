package ru.sbertech.test.lesson10.homework;

import ru.sbertech.test.lesson10.homework.Animal.Animal;
import ru.sbertech.test.lesson10.homework.Enums.Food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Daria on 06.09.2016.
 */
public class FarmLog {
    private String info = "";


    public void farmCreated() {
        info += "Farm was created at " + (new Date()).toString() + "\n";
    }

    public void animalAdded(Animal animal){
        info += "Animal {" + animal.toString()  + "} was added at " + (new Date()).toString() + "\n";
    }

    public void animalFed(Animal animal, Food food) {
        info += "Animal {" + animal.toString()  + "} was fed " + food.toString() + " at " + (new Date()).toString() + "\n";
    }

    public String getInfo() {
        return info;
    }
}
