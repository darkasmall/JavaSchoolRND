package ru.sbertech.test.lesson12.example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Account implements Runnable{
    private final Object myLock = new Object();

    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public Account(int saldo) {
        this.saldo = saldo;
    }

    public /*synchronized*/ void decreaseSaldo(int sum) {
        System.out.println("try decrease saldo");

        synchronized (myLock) {
            if (saldo - sum < 0) {
                System.out.println("Overdraft not avialabale!");
            } else {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                saldo -= sum;
            }
        }
    }





    @Override
    public void run() {
        int x = 12;
        for (int i = 0; i < x; i++) {
            this.decreaseSaldo(10);

            if(this.getSaldo() < 0) {
                throw new RuntimeException("current account overdrafted!");
            }
        }
    }
}
