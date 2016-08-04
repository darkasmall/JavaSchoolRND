package ru.sbertech.test.lesson7.homework;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * Created by Daria on 04.08.2016.
 */
public class SupportingMethods {


    public static byte[] getByteCode(String path) {
        byte[] b = null;
        try (FileInputStream inStr = new FileInputStream(path)) {
            b = new byte[inStr.available()];
            inStr.read(b);

        } catch (Exception e) {
            System.out.println("Fail:" + e);
        }
        return b;
    }

    public static ArrayList<File> getFiles(File root)
    {
        ArrayList<File> result = new ArrayList<>();
        File[] subfiles = root.listFiles();
        for (File tmpFile : subfiles) {
            if (tmpFile.isDirectory()) {
                result.addAll(getFiles(tmpFile));
            }
            else
                result.add(tmpFile);
        }
        return result;
    }
}
