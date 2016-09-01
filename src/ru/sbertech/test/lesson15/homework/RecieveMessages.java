package ru.sbertech.test.lesson15.homework;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Daria on 01.09.2016.
 */
public class RecieveMessages extends Thread {
    private BufferedReader bufferedReader;
    private boolean stopFlag;

    public RecieveMessages(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
        stopFlag = false;
    }

    public void stopReceipt() {
        stopFlag = true;
    }

    @Override
    public void run() {
        while (!stopFlag) {
            try {
                String text =  bufferedReader.readLine();
                System.out.println(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
