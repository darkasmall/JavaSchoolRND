package ru.sbertech.test.lesson3.classwork.examples;

import ru.sbertech.test.lesson3.classwork.PersonFirstLoad;
import ru.sbertech.test.lesson3.classwork.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 18.07.2016.
 */

public class Example1_ArrayList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);
        System.out.println("---------------");

        Person p = new Person(10L, "Бирюков Виктор Валерьевич", "79185551234");

        System.out.print(
                persons.contains(p));
    }


}
