package ru.sbertech.test.lesson18.homework.ProxyExample;

/**
 * Created by Daria on 12.09.2016.
 */
public class BankAccount implements Account{
    private Double account;
    private final String password;
    private final int id;
    private static String status = "avaliable";

    public BankAccount(int id, String password) {
        this.id = id;
        this.password = password;
        account = 0.0;
    }

    @Override
    public String printAccount() {
        return "На счету " + id + " лежит " + account;
    }

    @Override
    public String push(Double sum) {
        if (status.equals("avaliable")) {
            if (sum >= 0) {
            account += sum;
            return "На счет " + id + " успешно зачислено " + sum;
            } else return "Операция зачисления не может быть совершена. Некорректная сумма " + sum;

        } else
            return "Операция зачисления не может быть совершена. Счет " + id + " заморожен";
    }

    @Override
    public String withdraw(Double sum){
        if (status.equals("avaliable")) {
            if (sum <= account) {
                account -= sum;
                return "Со счета " + id + " успешно списано " + sum;
            }
            else
                return "Операция списания не может быть совершена. На счету " + id + " недостаточно средств";
        }
        else return "Операция списания не может быть совершена. Счет " + id + " заморожен";
    }

    @Override
    public String freeze() {
        if (status.equals("freezing")) {
            return "Счет " + id + " уже заморожен";
        } else {
            this.status = "freezing";
            return "Счет " + id + " успешно заморожен";
        }
    }

    @Override
    public String unfreeze(String password) {
        if(this.password.equals(password)){
            this.status = "avaliable";
            return "Счет " + id + " успешно разморожен";
        } else {
            return "Счет " + id + " не может быть разморожен, неверный пароль";
        }
    }
}
