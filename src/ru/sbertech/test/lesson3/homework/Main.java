package ru.sbertech.test.lesson3.homework;

/**
 * Created by Daria on 20.07.2016.
 */
public class Main {
    static public void main(String[] args) {
        String filename = "D:\\MyJavaProjects\\JavaSchoolRND\\src\\ru\\sbertech\\test\\lesson3\\homework\\input.txt";
        System.out.println("-----Задание 1-----");
        Task1.action(filename);
        System.out.println("-----Задание 2-----");
        Task2.action(filename);
        System.out.println("-----Задание 3-----");
        Task3.action(filename);
        System.out.println("-----Задание 4-----");
        Task4.action(filename);
        System.out.println("-----Задание 5-----");
        Task5.action();
        System.out.println("-----Задание 6-----");
        int[] linesNumbers = {1,2,30};
        Task6.action(filename, linesNumbers);
    }
}
