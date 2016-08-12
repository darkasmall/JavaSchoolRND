package ru.sbertech.test.lesson9.classwork;

import java.io.*;

/**
 * Created by Student on 08.08.2016.
 */

class A implements Serializable{
    public B getB() {return b;}
    public void setB(B b) {this.b = b;}
    private B b;
}

class C implements Serializable{
    public A getA() {return a;}
    public void setA(A a) {this.a = a;}
    private A a;
}

class B implements Serializable{
    public C getC() {return c;}
    public void setC(C c) {this.c = c;}
    private C c;
}

public class RecursiveLinks{
    public static void main(String[] args) throws Exception{
        String fileName = "src/ru/sbertech/test/lesson9/classwork/links.bin";

        A a = new A();
        B b = new B();
        C c = new C();

        a.setB(b);
        b.setC(c);
        c.setA(a);

        try(FileOutputStream fis = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fis)) {
            oos.writeObject(a);
            oos.writeObject(b);
            oos.writeObject(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        A a1;
        B b1;
        C c1;

        try(FileInputStream fos = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fos)){
            a1 = (A) ois.readObject();
            b1 = (B) ois.readObject();
            c1 = (C) ois.readObject();
            System.out.println(a == a1);
            System.out.println(b == b1);
            System.out.println(c == c1);

            System.out.println(a.getB() == b1);
            System.out.println(b.getC() == c1);
            System.out.println(c.getA() == a1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //all must be false

    }
}
