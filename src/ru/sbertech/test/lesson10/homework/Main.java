package ru.sbertech.test.lesson10.homework;

import ru.sbertech.test.lesson10.homework.Animal.Animal;
import ru.sbertech.test.lesson10.homework.Animal.Bunny;
import ru.sbertech.test.lesson10.homework.Animal.GuineaPig;
import ru.sbertech.test.lesson10.homework.Enums.Food;
import ru.sbertech.test.lesson10.homework.Enums.Gender;

import java.util.Arrays;

import static ru.sbertech.test.lesson10.homework.RandomAnimal.getRandomAnimal;

/**
 * Created by Daria on 12.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        GuineaPig parry = new GuineaPig("Parry", Gender.female);
        Bunny bon = new Bunny("BonBon", Gender.female);

        Animal an = getRandomAnimal("ru.sbertech.test.lesson10.homework.Animal.Crocodile");
        Animal bn = getRandomAnimal("ru.sbertech.test.lesson10.homework.Animal.Raven");
        Animal rb = getRandomAnimal("ru.sbertech.test.lesson10.homework.Animal.Bunny");

        Farm myFarm = new Farm(Arrays.asList(new Animal[]{parry, bon, an, bn, rb}));
        System.out.println(myFarm);

        myFarm.feed(Food.grass);
        System.out.println(myFarm);

        System.out.println(myFarm.getLog());
    }
}
