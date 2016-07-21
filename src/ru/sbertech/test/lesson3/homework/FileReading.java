package ru.sbertech.test.lesson3.homework;

import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Daria on 20.07.2016.
 */
public class FileReading {
    public static Collection<String> readWords(String filename, Collection<String> storage) {
        // try-с-ресурсами, JDK7
        try (FileInputStream f = new FileInputStream(filename)) {
            Scanner sc = new Scanner(f);

            while(sc.hasNext()) {
                String tmpStr = sc.nextLine();
                String[] words = tmpStr.split("\\s+");
                for (String word : words) {
                    storage.add(word);
                }
            }
            sc.close();
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        return storage;
    }


    public static Map<String, Integer> readWords(String filename, Map<String, Integer> storage) {
        // try-с-ресурсами, JDK7
        try (FileInputStream f = new FileInputStream(filename)) {
            Scanner sc = new Scanner(f);

            while(sc.hasNext()) {
                String tmpStr = sc.nextLine();
                String[] words = tmpStr.split("\\s+");
                for (String word : words) {
                    if (!storage.containsKey(word))
                        storage.put(word, 1);
                    else {
                        Integer oldVal = storage.get(word);
                        storage.remove(word);
                        storage.put(word, oldVal + 1);
                    }
                }
            }
            sc.close();
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        return storage;
    }

    public static Collection<String> readLines(String filename, Collection<String> storage) {
        // try-с-ресурсами, JDK7
        try (FileInputStream f = new FileInputStream(filename)) {
            Scanner sc = new Scanner(f);

            while(sc.hasNext()) {
                storage.add(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        return storage;
    }

    public static LinkedList<String> readLinesReverse(String filename, LinkedList<String> storage) {
        // try-с-ресурсами, JDK7
        try (FileInputStream f = new FileInputStream(filename)) {
            Scanner sc = new Scanner(f);

            while(sc.hasNext()) {
                   storage.addFirst(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        return storage;
    }
}
