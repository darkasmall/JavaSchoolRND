package ru.sbertech.test.lesson15.homework;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Daria on 01.09.2016.
 */

public class ChatConnection extends Thread {

    private Socket socket;
    private String nikname;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private static List<ChatConnection> connections = Collections.synchronizedList(new ArrayList<>());

    public ChatConnection(Socket socket, List<ChatConnection> connections) throws IOException {
        this.socket = socket;
        this.connections = connections;
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    @Override
    public void run() {
        try {
            nikname = bufferedReader.readLine();
            synchronized (connections) {
                for(ChatConnection c : connections) {
                    c.bufferedWriter.write(nikname + " присоединился к разговору");
                    c.bufferedWriter.write("\n");
                    c.bufferedWriter.flush();
                }
            }
            while(true) {
                String str = bufferedReader.readLine();
                if (str.equals("exit")) {
                    break;
                }
                synchronized (connections) {
                    for(ChatConnection c : connections) {
                        c.bufferedWriter.write(nikname + ": " + str);
                        c.bufferedWriter.write("\n");
                        c.bufferedWriter.flush();
                    }
                }
            }

            synchronized (connections) {
                for(ChatConnection c : connections) {
                    c.bufferedWriter.write(nikname + " покинул разговор");
                    c.bufferedWriter.write("\n");
                    c.bufferedWriter.flush();
                }
                connections.remove(this);
            }
            bufferedReader.close();
            bufferedWriter.close();
            socket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
