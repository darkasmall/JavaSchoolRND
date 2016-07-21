package ru.sbertech.test.lesson3.homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Daria on 21.07.2016.
 */

public class Task5 {
    public static void action() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i += 2) {
            list.add(i);
        }
        IteratorReverse itr =  new IteratorReverse(list);
        while(itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }
}
