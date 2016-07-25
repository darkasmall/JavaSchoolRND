package ru.sbertech.test.lesson5;

/**
 * Created by Student on 25.07.2016.
 */

class MyException extends RuntimeException {
}

public class MyExceptionTest{
    public static void main(String[] args) {
        throw new MyException();
    }
}
