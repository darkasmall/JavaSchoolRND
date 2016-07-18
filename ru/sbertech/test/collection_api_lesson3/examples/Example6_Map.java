package ru.sbertech.test.collection_api_lesson3.examples;

import ru.sbertech.test.collection_api_lesson3.Person;
import ru.sbertech.test.collection_api_lesson3.PersonFirstLoad;

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
