package ru.sbertech.test.lesson12.example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Square implements Runnable {
    private Object lockWidth = new Object();
    private Object lockLocation = new Object();


    private int width;
    private int x;
    private int y;

    public Square(int width, int x, int y) {
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        synchronized (lockWidth) {
            this.width = width;
        }
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public void changeLocation(int x, int y) {

        System.out.println("Start changing!");

        synchronized (lockLocation) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.x = x;
            this.y = y;
        }
        System.out.println("Changed!");
    }

    @Override
    public void run() {
        changeLocation(2,3);
    }
}
