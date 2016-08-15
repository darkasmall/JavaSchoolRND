package ru.sbertech.test.lesson11;


/*

Есть 2 файла - 1й со словами, 2й с настройками(размер пула)
Загрузить в лист файл 1, посчитать количество букв в многопоточном режиме
размер пула ограничен настройкой из файла 2

 */

/**
 * Created by Student on 15.08.2016.
 */
public class SomeTask implements Runnable {
    @Override
    public void run() {

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("st: " + Thread.currentThread().getName() + "(" + i + ")");
        }

    }

    public static void main(String[] args){
        SomeTask st = new SomeTask();

        Thread t = new Thread(st);
        System.out.println("1: " + t.isAlive());

       // t.setDaemon(true);

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("2: " + t.isAlive());

        System.out.println("End of main programm");

    }


}
