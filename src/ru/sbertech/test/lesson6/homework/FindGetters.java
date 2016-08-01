package ru.sbertech.test.lesson6.homework;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Daria on 01.08.2016.
 */

public class FindGetters {
    private static boolean isGetter(Method method){
        if(!method.getName().startsWith("get"))
            return false;
        if(method.getParameterTypes().length != 0)
            return false;
        if(void.class.equals(method.getReturnType()))
            return false;
        return true;
    }

    public static void printGetters(Class c) {

        Method[] allMethods = c.getMethods();
        for(Method m : allMethods) {
            if (isGetter(m))
                System.out.println("getter: " + m.getName());
        }
    }
}
