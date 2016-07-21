package ru.sbertech.test.lesson3.homework;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Daria on 21.07.2016.
 */

public class Task4 {
    public static void action(String filename) {
        LinkedList<String> lines = new LinkedList<>();
        FileReading.readLinesReverse(filename, lines);
        System.out.println("Строки файла в обратном порядке: ");
        for(String line : lines) {
            System.out.println(line);
        }
    }
}
