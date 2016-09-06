package ru.sbertech.test.lesson10.homework.Animal;

import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Skin;

import java.util.HashSet;

/**
 * Created by Daria on 06.09.2016.
 */
public class AnimalCharacteristics {

    public AnimalCharacteristics(Skin skin, HashSet<Food> permissibleFood) {
        this.skin = skin;
        this.permissibleFood = permissibleFood;
    }

    public Skin getSkin() {
        return skin;
    }

    public HashSet<Food> getPermissibleFood() {
        return permissibleFood;
    }

    private final Skin skin;
    private final HashSet<Food> permissibleFood;
}
