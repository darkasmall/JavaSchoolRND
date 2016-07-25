package ru.sbertech.test.lesson5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Student on 25.07.2016.
 */
public class FinallyTest2 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("c:\\1.txt");
            out = new FileOutputStream("c:\\2.txt");
            out.write(in.read());
        } catch (IOException e){
            System.out.println("File not found");

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                // NOP
            }

            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                // NOP
            }
        }
    }
}
