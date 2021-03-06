package ru.sbertech.test.lesson3.classwork.examples;

import ru.sbertech.test.lesson3.classwork.Person;
import ru.sbertech.test.lesson3.classwork.PersonFirstLoad;

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
