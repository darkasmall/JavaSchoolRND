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
    protected Skin skin;
    protected String name;
    protected Gender gender;
    protected Set<Food> permissibleFood = new HashSet<>();

    private boolean hungry = true;
    private boolean angry = true;

    public Set<Food> getPermissibleFood() {
        return permissibleFood;
    }

    public boolean isHungry() {
        return hungry;
    }

    public boolean isAngry() {
        return angry;
    }

    public Skin getSkin() {
        return skin;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    private String foodStatus() {
        if (isHungry()) return "hungry";
        else return "well-fed";
    }

    private String moodStatus() {
        if (isAngry()) return "angry";
        else return "friendly";
    }

    public void feed() {
        hungry = false;
    }

    public void becomeFriendly() {
        angry = false;
    }

    @Override
    public String toString() {
        String classString = this.getClass().toString();
        return classString.substring(classString.lastIndexOf(".") + 1) +
                " " +
                this.getName() +
                " " +
                this.foodStatus() +
                " " +
                this.moodStatus();
    }

}