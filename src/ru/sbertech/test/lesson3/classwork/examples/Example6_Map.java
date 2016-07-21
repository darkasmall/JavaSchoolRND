package ru.sbertech.test.lesson3.classwork.examples;

import ru.sbertech.test.lesson3.classwork.Person;
import ru.sbertech.test.lesson3.classwork.PersonFirstLoad;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Student on 18.07.2016.
 */
public class Example6_Map {
    public static void main(String[] args) {
        Map<String,Person> persons = new HashMap<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("---------------");

        System.out.println("size = " + persons.size());

        System.out.println(persons.get("16"));
    }
}
