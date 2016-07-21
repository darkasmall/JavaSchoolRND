package ru.sbertech.test.lesson1.homework;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Daria on 14.07.2016.
 */

/*
Задан массив из n чисел (a1, a2,..., an). Ваша задача — найти все числа, которые встречаются в массиве больше одного раза.
Обратите внимание, что каждое число, удовлетворяющее условию, следует выводить ровно один раз.
Входные данные
В первой строке входного файла дано число n (1 ≤ n ≤ 100) — количество чисел в массиве.
Во второй строке через пробел записаны числа a1, a2,..., an (1 ≤ ai ≤ 100).
Выходные данные
В первую строку выведите единственное число — количество чисел, которые встречаются больше одного раза.
Во вторую строку — сами значения. Числа выводите в возрастающем порядве, при выводе разделяйте пробелом.
Каждое число выводите ровно один раз.
 */

public class ID2031 {
    public static void main(String args[]){
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("input.txt");
            fout = new FileOutputStream("output.txt");
            Scanner sc = new Scanner(fin);

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            sc.close();

            Arrays.sort(arr);

            String res = "";
            boolean flag = false;
            int count = 0;

            for(int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1] && !flag) {
                    flag = true;
                    count++;
                    res += Integer.toString(arr[i]) + " ";
                }
                if (arr[i] != arr[i - 1] && flag) {
                    flag = false;
                }
            }

            byte[] answer = (Integer.toString(count) + "\n" + res).getBytes();
            fout.write(answer);

        } catch(IOException e) {
            System.out.println("I/O error: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Input file closing error: " + e2);
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e2) {
                System.out.println("Output file closing error: " + e2);
            }
        }
    }
}
