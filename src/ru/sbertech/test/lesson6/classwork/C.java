package ru.sbertech.test.lesson6.classwork;

/**
 * Created by Student on 28.07.2016.
 */
public class C extends B implements I{
    private A aC;
    private B bC;

    @ValidLength(5)
    private final String str = "first";

    public C() {
        aB = new A();
    }

    @Override
    public void someMethod(String param) {
        //aB.pubA(param);
        System.out.println(str + " " + param);
    }
}
