package ru.sbertech.test.lesson3.homework;

import java.util.TreeSet;

/**
 * Created by Daria on 21.07.2016.
 */

public class Task2 {
    public static void action(String filename) {
        TreeSet<String> words = new TreeSet<String>(new NewStringComparator());
        FileReading.readWords(filename, words);
        System.out.println("Отсортированные слова файла: ");
        for(String word : words) {
            System.out.println(word);
        }
    }
}
