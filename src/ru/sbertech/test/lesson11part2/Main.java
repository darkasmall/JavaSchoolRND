package ru.sbertech.test.lesson11part2;

import ru.sbertech.test.lesson11part2.example1.*;

import java.util.Date;

/**
 * Created by Student on 18.08.2016.
 */
public class Main {

    public static void main(String[] args) {
/*        Account account = new Account(100);
        int x = 3;

        for (int i = 0; i < x; i++) {
            new Thread(account).start();
        }*/

        /*Square square = new Square(2,3,4);

        Thread t1 = new Thread(square);
        Thread t2 = new Thread(square);

        t1.start();
        t2.start();*/

        /*Test test = new Test();
        Thread t = new Thread(test);
        t.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.end();
        System.out.println("End of main!");*/

      //  Man ivan = new Man("Ivan", new Date());

/*        Test t = new Test();
        Thread tr = new Thread(t);
        tr.start();
        tr.interrupt();*/

        MonitorExample monitorExample = new MonitorExample();

        Thread thr = new Thread(monitorExample);
        thr.start();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        monitorExample.sendMessage("Hello!");


    }
}
