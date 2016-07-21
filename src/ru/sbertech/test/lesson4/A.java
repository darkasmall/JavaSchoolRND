package ru.sbertech.test.lesson4;

/**
 * Created by Student on 21.07.2016.
 */
public class A<T> {
    T param1;

    public T getParam1() {
        return param1;
    }

    public void setParam1(T param1) {
        this.param1 = param1;
    }

    public A() {}

    public A(T param) {
        this.param1 = param;
    }

    public String getType() {
        return param1.getClass().getTypeName();
    }

    public static Integer getInteger() {
        return new Integer(10);
    }
}
