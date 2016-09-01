package ru.sbertech.test.lesson15.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Daria on 01.09.2016.
 */
public class ChatServer  {
    private static List<ChatConnection> connections = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальное количество собеседников");
        int clientsNumber = sc.nextInt();
        sc.close();

        ServerSocket socket = new ServerSocket(Consts.PORT);

        while (true) {
            Socket accept = socket.accept();
            String answer = "OK";
            if (connections.size() == clientsNumber) {
                answer = "ERR";
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                bufferedWriter.write(answer);
                bufferedWriter.write("\n");
                bufferedWriter.flush();

            } else {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                bufferedWriter.write(answer);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
                ChatConnection chatConnection = new ChatConnection(accept, connections);
                connections.add(chatConnection);
                chatConnection.start();
            }

        }

    }


}
