package ru.sbertech.test.lesson11;

/**
 * Created by Student on 15.08.2016.
 */
public class SomeThread extends Thread{
    @Override
    public void run() {
        System.out.println("I`m here!!!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I`m here now!!!");
    }
}
