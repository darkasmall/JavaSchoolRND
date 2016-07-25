package ru.sbertech.test.lesson5;

/**
 * Created by Student on 25.07.2016.
 */

class Ok implements AutoCloseable {
    private String message;

    public Ok(String message) {
        this.message = message;
        System.err.println("I'm created" + message);
    }

    @Override
    public void close() throws Exception {
        System.err.println("Все ресурсы освобождены" + message);
    }
}

class FailCreated implements AutoCloseable {
    private String message;

    public FailCreated(String message) {
        this.message = message;
        System.err.println("I'm creating" + message);
        throw new NullPointerException();
    }

    @Override
    public void close() throws Exception {
        System.err.println("Все ресурсы освобождены" + message);
    }
}

public class MyAutocloseable {
    public static void main(String[] args) throws Exception{
        try (Ok x = new Ok("x"); FailCreated y = new FailCreated("y")) {
            System.err.println("Buisness logic");
        }
    }
}
