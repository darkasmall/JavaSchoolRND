package ru.sbertech.test.lesson18.homework.DecoratorExample;


/**
 * Created by Daria on 09.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Variable x = new Variable("x");
        Variable y = new Variable("y");

        Formula f1 = new Addition(x,y);
        Formula f2 = new Subtraction(x,y);
        Formula f3 = new Multiplication(new Constant(2.0), f1);
        Formula f4 = new Division(f2, new Constant(3.0));
        Formula f = new Addition(f3, f4);

        try {
            System.out.println(f);

            x.setValue(16.0);
            y.setValue(7.0);

            System.out.println(f.calculate());

            x.setValue(3.0);
            y.setValue(21.0);

            System.out.println(f.calculate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
