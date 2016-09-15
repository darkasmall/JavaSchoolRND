package ru.sbertech.test.lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Document infoDoc = new Document(new InfoDocExecImpl());

        Account accA = new Account();
        accA.setSaldo(100L);

        Account accB = new Account();
        accB.setSaldo(0L);

       // d.setAccA(accA);
       // d.setAccB(accB);

       // d.setSumma(10L);

      //  DocumentExecutor documentExecutor = new DocumentExecutor();
      //  documentExecutor.exec(d);
    }
}
