package ru.sbertech.test.lesson3.homework;

import java.util.HashSet;

/**
 * Created by Daria on 20.07.2016.
 */

public class Task1 {
    public static void action(String filename) {
        HashSet<String> words = new HashSet<String>();
        FileReading.readWords(filename, words);
        int wordsCount = words.size();
        System.out.println("Количество различных слов в заданном файле: " + wordsCount);
       /* for(String word : words) {
            System.out.println(word);
        } */
    }
}
