package ru.sbertech.test.lesson10.homework;

/**
 * Created by Daria on 12.08.2016.
 */
abstract public class Animal {
    protected Skin skin;
    protected String name;

    public boolean isHungry = true;
    public boolean isAngry = true;

    public Skin getSkin() {
        return skin;
    }

    public String getName() {
        return name;
    }

    private String foodStatus() {
        if (isHungry) return "hungry";
        else return "well-fed";
    }

    private String moodStatus() {
        if (isAngry) return "angry";
        else return "friendly";
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