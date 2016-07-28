package ru.sbertech.test.lesson5.homework;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by Daria on 27.07.2016.
 */

public class SiteContent {
    public static void readContent(String urlText) throws IOException {
        int c;

        URL url = new URL(urlText);
        URLConnection urlCnntn = url.openConnection();

        InputStream inStream = urlCnntn.getInputStream();
        while ((c = inStream.read()) != -1) {
            System.out.print((char) c);
        }
        inStream.close();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String urlText;

        while (true) {
            try {
                System.out.println("Введите URL: ");
                urlText = in.nextLine();
                readContent(urlText);
            } catch (IOException e) {
                System.out.print("Некорректный ввод. ");
                continue;
            }
            break;
        }

        in.close();
    }
}
