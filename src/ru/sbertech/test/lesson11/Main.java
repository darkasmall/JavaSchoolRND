package ru.sbertech.test.lesson11;

/**
 * Created by Student on 15.08.2016.
 */
public class Main {
    public static void main(String[] args){

        SomeTask st1 = new SomeTask();

        Thread t1 = new Thread(st1);
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(st1);
        t2.setPriority(Thread.MIN_PRIORITY);

        Thread t3 = new Thread(st1);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();





        /*SomeThread st = new SomeThread();
        st.start();
        System.out.println("End of main programm");*/

/*
        new Thread(new Runnable() {
            public void run() {
                System.out.println("I`m here now");
            }
        }).start();
*/

    }
}
