package ru.sbertech.test.lesson11part2.example1;

import java.util.Date;

/**
 * Created by Student on 18.08.2016.
 */
public class Man {
    private final String name;
    private final Date date;


    public Man(String name, Date date) {
        this.name = name;
        this.date = new Date(date.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}
