package ru.sbertech.test.lesson18.homework.ProxyExample;

/**
 * Created by Daria on 12.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Card card = new Card(12345, "pineapple");

        System.out.println(card.push(12000.0));
        System.out.println(card.withdraw(600.57));
        System.out.println(card.printAccount());
        System.out.println(card.freeze());
        System.out.println(card.withdraw(122.97));
        System.out.println(card.unfreeze("apple"));
        System.out.println(card.unfreeze("pineapple"));
        System.out.println(card.withdraw(15300.0));
    }
}
