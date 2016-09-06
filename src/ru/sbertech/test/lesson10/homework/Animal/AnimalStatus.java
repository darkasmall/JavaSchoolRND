package ru.sbertech.test.lesson10.homework.Animal;

/**
 * Created by Daria on 06.09.2016.
 */
public class AnimalStatus {

    private boolean angry = true;
    private boolean hungry = true;


    public boolean isAngry() {
        return angry;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public String toString() {
        String s1 = isHungry() ? "hungry " : "well-fed ";
        String s2 = isAngry() ? "angry " : "friendly ";
        return s1 + s2;
    }
}
