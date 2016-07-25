package ru.sbertech.test.lesson5;

/**
 * Created by Student on 25.07.2016.
 */
public class TestException {


    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int x = 1;
        int y = 0;
        System.out.println(x / y);
    }
}
