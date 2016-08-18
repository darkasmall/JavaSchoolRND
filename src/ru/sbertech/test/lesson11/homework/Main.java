package ru.sbertech.test.lesson11.homework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*

Есть 2 файла - 1й со словами, 2й с настройками(размер пула)
Загрузить в лист файл 1, посчитать количество букв в многопоточном режиме
размер пула ограничен настройкой из файла 2

*/


/**
 * Created by Daria on 18.08.2016.
 */


public class Main {
    public static void main(String[] args) {

        String wordsFileName = "src/ru/sbertech/test/lesson11/homework/words.txt";
        String poolSizeFileName = "src/ru/sbertech/test/lesson11/homework/poolSize.txt";

        List<String> words = new ArrayList<>();
        int poolSize = 0;

        try(FileInputStream fsWords = new FileInputStream(wordsFileName);
            FileInputStream fsPoolSize = new FileInputStream(poolSizeFileName)) {

            Scanner sc = new Scanner(fsWords);

            while (sc.hasNextLine())
                words.add(sc.nextLine());
            sc.close();

            sc = new Scanner(fsPoolSize);
            poolSize = sc.nextInt();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        List<String> words = Arrays.asList("aaa", "bb", "123", "as34", "3453fdf");
//        int poolSize = 3;


        int res = MyExecutorService.calcLettersInList(poolSize, words);
        System.out.println("Количество букв в файле: " + res);

    }
}
