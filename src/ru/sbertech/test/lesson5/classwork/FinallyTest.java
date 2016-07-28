package ru.sbertech.test.lesson5.classwork;

/**
 * Created by Student on 25.07.2016.
 */
public class FinallyTest {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run(){
                while (true) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I'm thread");
                }
            }
        }).start();

        int a = 1/0;
    }


}
