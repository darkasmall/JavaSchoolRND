package ru.sbertech.test.lesson7.classwork;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Student on 01.08.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        /*
        System.out.println(1);
        try {
            Person person =  (Person) Main.class.getClassLoader().loadClass("ru.sbertech.test.lesson7.classwork.Person").newInstance();
        } catch (Exception e) {

        }
        System.out.println(2);
        */

        /*
        for (int i = 0; i < 1_000_000; i++) {
            new URLClassLoader(new URL[] {new URL("file:/J:/lecture7/person.jar")}).loadClass("ru.sbt.bvv.lecture7.Person");

        }
        */

        /*
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[] {new URL("file:/J:/lecture7/person.jar")}, null);
        Class<?> persClazz = urlClassLoader.loadClass("ru.sbt.bvv.lecture7.Person");

        Method m = persClazz.getMethod("info");
        m.invoke(persClazz.newInstance());
        */
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[] {new URL("file:/J:/lecture7/person.jar")});

        Class<?> calcClazz = urlClassLoader.loadClass("ru.sbt.bvv.lecture7.CalculatorImpl");
        ((Calculator) calcClazz.newInstance()).calc();

        Calculator calculator = new CalculatorImpl();
        calculator.calc();





    }

}
