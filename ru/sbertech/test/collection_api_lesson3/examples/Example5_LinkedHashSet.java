package ru.sbertech.test.collection_api_lesson3.examples;

import ru.sbertech.test.collection_api_lesson3.Person;
import ru.sbertech.test.collection_api_lesson3.PersonFirstLoad;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Student on 18.07.2016.
 */
public class Example5_LinkedHashSet {
    public static void main(String[] args) {
        Set<Person> persons = new LinkedHashSet<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("---------------");

        System.out.print("size = " + persons.size());
    }
}
