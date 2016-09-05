package ru.sbertech.test.lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class Document{

    public Client getClientA() {
        return clientA;
    }

    public void setClientA(Client clientA) {
        this.clientA = clientA;
    }

    public Account getAccA() {
        return accA;
    }

    public void setAccA(Account accA) {
        this.accA = accA;
    }

    public Client getClientB() {
        return clientB;
    }

    public void setClientB(Client clientB) {
        this.clientB = clientB;
    }

    public Account getAccB() {
        return accB;
    }

    public void setAccB(Account accB) {
        this.accB = accB;
    }

    public Long getSumma() {
        return summa;
    }

    public void setSumma(Long summa) {
        this.summa = summa;
    }

    public ExecBehavior getExecBehavior() {
        return execBehavior;
    }

    public void setExecBehavior(ExecBehavior execBehavior) {
        this.execBehavior = execBehavior;
    }

    private Client clientA;
    private Account accA;
    private Client clientB;
    private Account accB;
    private Long summa;
    private String user;
    private ExecBehavior execBehavior;

    public Document(ExecBehavior execBehavior) {
        this.execBehavior = execBehavior;
    }

// для каждого метода - свой интерфейс
    public void print() {
        System.out.println("summa: " + summa);
    }

    public void printUserInfo() {
        System.out.println("Document User: " + user);
    }

    public void saveToDB(){
        System.out.println("Save document in database");
    }
}
