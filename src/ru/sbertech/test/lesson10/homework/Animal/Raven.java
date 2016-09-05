package ru.sbertech.test.lesson10.homework.Animal;

import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Gender;
import ru.sbertech.test.lesson10.homework.Enums.Skin;

/**
 * Created by Daria on 12.08.2016.
 */
public class Raven extends Animal{

    public Raven(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.skin = Skin.plumage;
        this.permissibleFood.add(Food.meat);
        this.permissibleFood.add(Food.fruits);
    }
}
