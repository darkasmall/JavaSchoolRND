package ru.sbertech.test.lesson6.classwork;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 28.07.2016.
 */

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> loggedList = (List) Proxy.newProxyInstance(
                list.getClass().getClassLoader(),
                list.getClass().getInterfaces(),
                new InvocationHandlerImpl(list));

        loggedList.add("second");
        System.out.println(loggedList.get(0));
        System.out.println(loggedList.remove(0));
        System.out.println(loggedList.size());
    }
}
