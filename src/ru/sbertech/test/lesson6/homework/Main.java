package ru.sbertech.test.lesson6.homework;

/**
 * Created by Daria on 01.08.2016.
 */


public class Main {
    public static void main(String[] args) {
        Class test = TestClass.class;
        FindGetters.printGetters(test);
        StringFieldsChecking.printChecking(test);
    }

}
