package ru.sbertech.test.lesson5.classwork;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Student on 25.07.2016.
 */

class Parent {
    /**
     *
     * @throws FileNotFoundException
     *
     **/
    public void method() throws IOException
    {

    }
}

public class TestThrows extends Parent {
   /* public static void main(String[] args) {
        try {
            f();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void f() throws IOException{
        g();
    }

    public static void g() throws IOException{
        FileInputStream in = new FileInputStream("1.txt");

        in.close();
    }
    */
    @Override
    public void method() throws FileNotFoundException {

    }

    public void test(Parent a) throws IOException{
        a.method();
    }

    public static void main(String[] args) throws IOException{
        Parent a = new Parent();
        TestThrows b = new TestThrows();

        TestThrows ch = new TestThrows();
        ch.test(a);
        ch.test(b);
    }
}
