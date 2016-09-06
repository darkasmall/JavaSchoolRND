package ru.sbertech.test.lesson10.homework.Animal;

import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Gender;
import ru.sbertech.test.lesson10.homework.Enums.Skin;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Daria on 12.08.2016.
 */

abstract public class Animal {
    public AnimalCharacteristics characteristics;
    public AnimalStatus status = new AnimalStatus();

    protected String name;
    protected Gender gender;


    protected void create(String name, Gender gender, AnimalCharacteristics characteristics){
        this.name = name;
        this.gender = gender;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }


    public void feed() {
        status.setHungry(false);
    }

    public void becomeFriendly() {
        status.setAngry(false);
    }



    @Override
    public String toString() {
        String classString = this.getClass().toString();
        return classString.substring(classString.lastIndexOf(".") + 1) +
                " " +
                this.getName() +
                " " +
                this.gender;
    }

    public String toStringWithStatus(){
        return toString() + "  " + status.toString();
    }

}