package ru.sbertech.test.lesson15.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Student on 29.08.2016.
 */
public class ClientUDP {
    public static final String HOST = "localhost";
    public static final int PORT = 3333;

    public static void main(String[] args) throws IOException{
        InetAddress inetAddress = InetAddress.getByName(HOST);
        try (
            DatagramSocket socket = new DatagramSocket();
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        )
        {
            String line;
            do {
                System.out.println("Enter message: ");
                line = console.readLine();
                byte[] bytes = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length, inetAddress, PORT);
                socket.send(dp);
            } while (!line.equals("exit"));
        }
    }
}