package ru.sbertech.test.lesson10.homework.Animal;

import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Gender;
import ru.sbertech.test.lesson10.homework.Enums.Skin;

/**
 * Created by Daria on 12.08.2016.
 */
public class Parrot extends Animal {

    public Parrot(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.skin = Skin.plumage;
        this.becomeFriendly();
        this.permissibleFood.add(Food.fruits);
        this.permissibleFood.add(Food.grain);
    }
}
