package ru.sbertech.test.lesson6.homework;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Daria on 01.08.2016.
 */
public class StringFieldsChecking {

    private static boolean isStringConstant(Field f) {
        boolean result = false;
        if (f.getType() == String.class
                && Modifier.isFinal(f.getModifiers()))
            result = true;
        return result;
    }

    public static void printChecking(Class c) {

        Field[] fields = c.getDeclaredFields();
        for(Field f : fields) {
            if (isStringConstant(f)) {
                try{
                    String value = f.get(c).toString();
                    String name = f.getName();
                    if ( name == value ) {
                        System.out.println("ок: " + name + " - " + value);
                    }
                    else
                        System.out.println("wrong: " + name + " - " + value);
                } catch (IllegalAccessException e) {
                    System.out.println("Ошибка доступа!" + e);
                }
            }
        }
    }
}
