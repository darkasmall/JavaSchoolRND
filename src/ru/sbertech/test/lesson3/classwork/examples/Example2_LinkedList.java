package ru.sbertech.test.lesson3.classwork.examples;

import ru.sbertech.test.lesson3.classwork.PersonFirstLoad;
import ru.sbertech.test.lesson3.classwork.Person;

import java.util.LinkedList;

/**
 * Created by Student on 18.07.2016.
 */
public class Example2_LinkedList {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);
        System.out.println("---------------");

        System.out.println(persons.peek());

        System.out.println("---------------");

        persons.offer(new Person(17L, "Бирюков Виктор Валерьевич", "12345"));
        for (int i = 0; i < 5; i++) {
            persons.pop();
        }

        PersonFirstLoad.print(persons);

    }
}
