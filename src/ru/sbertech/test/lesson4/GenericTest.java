package ru.sbertech.test.lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 21.07.2016.
 */
public class GenericTest {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        A<List> a = new A<>();
        a.setParam1(new ArrayList<String>());
        A<String> aString = new A<>();
        aString.setParam1(new String("test"));
        System.out.println(a.getType());
        System.out.println(aString.getType());

        System.out.println(
        new A<String>(new String()) {
            @Override
            public String getType() {
                return "Abstract " + param1.getClass().getTypeName();
            }
        }.getType());

        Integer i = new Integer(10);
        //System.out.println(B.<Short>getType(new Short("12")));
        System.out.println(B.getType(i));


        List<?> list = new ArrayList<Integer>();
        list.add(null);

        A<? extends Integer> aaa = new A<>(new Integer(10));
        Integer iy = aaa.getParam1();
        //a.setParam1(new Integer(10));
        System.out.println(aaa.getType());


        List<? super Number> ks = new ArrayList<>();
        ks.add(new Integer(10));
        ks.add(new Integer(8));
        ks.add(new Integer(11));
        ks.add(new Integer(9));

        ks.forEach(System.out::println);

        //Number n = ks.get(0);
    }
}
