package ru.sbertech.test.lesson3.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Daria on 21.07.2016.
 */

public class Task3 {
    public static void action(String filename) {
        Map<String, Integer> words = new HashMap<String, Integer>();
        FileReading.readWords(filename, words);
        System.out.println("Количество попаданий в тексте:");

        Iterator it = words.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> pair = ((Map.Entry<String, Integer>) it.next());
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }



}
