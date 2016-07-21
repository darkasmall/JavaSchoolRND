package ru.sbertech.test.lesson3.homework;

import java.util.ArrayList;

/**
 * Created by Daria on 21.07.2016.
 */
public class Task6 {
    public static void action(String filename, int[] linesNumbers) {
        ArrayList<String> lines = new ArrayList<String>();
        FileReading.readLines(filename, lines);
        try {
            for (int i : linesNumbers) {
                System.out.println(lines.get(i - 1));
            }
        }
        catch(java.lang.IndexOutOfBoundsException e) {
            System.out.println("Нет строки под таким номером: " + e);
        }
    }
}
