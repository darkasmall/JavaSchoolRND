package ru.sbertech.test.lesson10.homework;

import org.jetbrains.annotations.Nullable;
import ru.sbertech.test.lesson10.homework.Animal.Animal;
import ru.sbertech.test.lesson10.homework.Enums.Gender;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Daria on 06.09.2016.
 */
public abstract class RandomAnimal {
    private final static Random random = new Random((new Date().getTime()));


    @Nullable
    public static Animal getRandomAnimal(String type) {
        try {
            Class animalClass = Class.forName(type);
            Constructor constructor = animalClass.getConstructor(String.class, Gender.class);
            constructor.setAccessible(true);
            Gender gender = getRandomGender();
            return (Animal) constructor.newInstance(getRandomName(gender), gender);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Gender getRandomGender() {
        if (random.nextBoolean())
            return Gender.female;
        else
            return Gender.male;
    }

    private static String getRandomName(Gender gender) {
        String randomName = "Nameless";

        String filename = "src/ru/sbertech/test/lesson10/homework/Names/";
        filename += (gender.equals(Gender.female)) ? "namesFemale.txt" : "namesMale.txt";


        try (Stream<String> stream = Files.lines((new File(filename)).toPath());) {

            Object[] lines = stream.toArray();
            int i = random.nextInt(lines.length);
            randomName = (String)lines[i];


        } catch (IOException e) {
            e.printStackTrace();
        }

        return randomName;
    }
}
