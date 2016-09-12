package ru.sbertech.test.lesson18.homework.ProxyExample;

/**
 * Created by Daria on 12.09.2016.
 */
public interface Account {
    public String push(Double sum);
    public String withdraw(Double sum);
    public String freeze();
    public String unfreeze(String password);
    public String printAccount();
}
