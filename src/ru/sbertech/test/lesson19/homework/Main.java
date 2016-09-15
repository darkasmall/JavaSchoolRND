package ru.sbertech.test.lesson19.homework;
import ru.sbertech.test.lesson19.homework.FinitStateAutomaton.XYZEntry.XYZEntryFSA;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Daria on 15.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String inputString = scanner.nextLine();
        scanner.close();

        System.out.println("В строке содержится 'xyz': " + new XYZEntryFSA().recognize(inputString));

    }
}
