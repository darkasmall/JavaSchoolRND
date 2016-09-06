package ru.sbertech.test.lesson10.homework.Animal;

import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Gender;
import ru.sbertech.test.lesson10.homework.Enums.Skin;

import java.util.HashSet;

/**
 * Created by Daria on 12.08.2016.
 */
public class Raven extends Animal{

    public Raven(String name, Gender gender) {
        HashSet<Food> food = new HashSet<>();
        food.add(Food.meat);
        food.add(Food.fruits);
        create(name, gender, new AnimalCharacteristics(Skin.plumage, food));
    }
}
