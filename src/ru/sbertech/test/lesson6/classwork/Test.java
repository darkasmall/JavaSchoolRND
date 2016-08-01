package ru.sbertech.test.lesson6.classwork;


import java.lang.reflect.Field;

/**
 * Created by Student on 28.07.2016.
 */
public class Test {
    public static void main(String[] args) {
        //C c = new C();
        //Arrays.asList(c.getClass().getMethods()).forEach(System.out::println);


        //Arrays.asList(B.class.getDeclaredMethods()).forEach(System.out::println);

        try {
           // System.out.println(A.class.getDeclaredMethod("privA", String.class));
           // System.out.println(C.class.getField("aB"));
           // System.out.println(Object.class.getSuperclass());

            /* Method m = A.class.getDeclaredMethod("privA", String.class);
            m.setAccessible(true);
            m.invoke(A.class.newInstance(), "test"); */

            /* Method m = I.class.getMethod("someMethod", String.class);
            m.invoke(C.class.newInstance(), "test"); */

            Field f = C.class.getDeclaredField("str");
            f.setAccessible(true);
            C c = new C();
            System.out.println(f.get(c));

            f.set(c, "second");
            System.out.println(f.get(c));

            c.someMethod("test");

        //} catch (NoSuchMethodException | NoSuchFieldException e) {
        } catch (Exception e) {
            System.out.println("Нет такого! " + e);
        }

    }
}
