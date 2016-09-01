package ru.sbertech.test.lesson15.homework;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Daria on 01.09.2016.
 */
public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(Consts.HOST, Consts.PORT);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String servAnswer = bufferedReader.readLine();
        if (servAnswer.equals("ERR")) {
            System.out.println("Число собеседников достигло максимума. Попробуйте присоединиться к разговору позже");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите ник:");
            bufferedWriter.write(sc.nextLine());
            bufferedWriter.write("\n");
            bufferedWriter.flush();


            RecieveMessages rm = new RecieveMessages(bufferedReader);
            rm.start();

            String text = "";
            while (!text.equals("exit")) {
                text = sc.nextLine();
                bufferedWriter.write(text);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
            }
            rm.stopReceipt();
            sc.close();

        }
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }


}
