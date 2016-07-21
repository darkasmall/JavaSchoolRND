package ru.sbertech.test.lesson3.classwork.BeforeGenerics;

/**
 * Created by Student on 18.07.2016.
 */
public class Apple {
    final Long id = counter++;
    static Long counter = new Long(0L);

    public Long getId() {
        return id;
    }
}
