package ru.sbertech.test.lesson16.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daria on 05.09.2016.
 */
public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> summator = new HashMap<>();
        String value = "value ";

        for(int i = 0; i < 100.000; ++i){
            summator.put(i, value + i);
        }

        System.out.println(1);
    }
}
