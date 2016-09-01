package ru.sbertech.test.lesson15.classwork.second;

import java.io.*;
import java.net.Socket;
import java.util.Random;

/**
 * Created by Student on 29.08.2016.
 */
public class Worker implements Runnable {
    private Socket socket;

    public Worker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;

        int secretNumber  = new Random().nextInt(9);
        System.out.println("Загадали " + secretNumber);

        try {
            inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

            bufferedWriter.write("Попробуй угадай");
            bufferedWriter.write("\n");
            bufferedWriter.flush();

            String answer;
            while(true) {
                if ((answer = bufferedReader.readLine()) != null) {
                    if (secretNumber == Integer.parseInt(answer)) {
                        bufferedWriter.write("Угадал");
                        bufferedWriter.write("\n");
                        bufferedWriter.flush();
                        break;
                    } else {
                        bufferedWriter.write("Не угадал");
                        bufferedWriter.write("\n");
                        bufferedWriter.flush();
                    }
                } else {
                    System.out.println("end of stream");
                }
            }

            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
