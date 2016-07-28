package ru.sbertech.test.lesson5.classwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Student on 25.07.2016.
 */
public class FinallyTestTryWithResources {
    public static void main(String[] args) {
        try (   FileInputStream in = new FileInputStream("c:\\1.txt");
                FileOutputStream out = new FileOutputStream("c:\\2.txt");
        ) {
            out.write(in.read());
        } catch (IOException e) {
            System.out.println("Something goes wrong");
        }
    }
}
