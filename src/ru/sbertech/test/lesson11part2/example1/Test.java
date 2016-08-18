package ru.sbertech.test.lesson11part2.example1;

/**
 * Created by Student on 18.08.2016.
 */
public class Test implements Runnable{

    private boolean endFlag = false;

    public void end(){
        setEndFlag(true);
    }

    public synchronized boolean isEndFlag() {
        return endFlag;
    }

    public synchronized void setEndFlag(boolean endFlag) {
        this.endFlag = endFlag;
    }

    public void run(){
        while (!isEndFlag()) {
            //do something
        }
    }
}
