package ru.sbertech.test.lesson18.homework.ProxyExample;

/**
 * Created by Daria on 12.09.2016.
 */
public class Card implements Account{
    private final BankAccount bankAccount;

    public Card(int id, String password) {
        bankAccount = new BankAccount(id, password);
    }

    @Override
    public String push(Double sum) {
        return bankAccount.push(sum);
    }

    @Override
    public String withdraw(Double sum) {
        return bankAccount.withdraw(sum);
    }

    @Override
    public String freeze() {
        return bankAccount.freeze();
    }

    @Override
    public String unfreeze(String password) {
        return bankAccount.unfreeze(password);
    }

    @Override
    public String printAccount() {
        return bankAccount.printAccount();
    }
}
