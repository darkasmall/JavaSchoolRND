package ru.sbertech.test.lesson18.homework.DecoratorExample;

import java.util.Set;

/**
 * Created by Daria on 09.09.2016.
 */
public class Variable extends SimpleFormula {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    public void setValue(Double value) {
        this.value = value;
        System.out.println(name + " = " + Double.toString(value));
    }

    @Override
    public Double calculate() throws Exception {
        if(this.value != null)
        return super.calculate();
        throw new Exception("Значениe переменной " + name + " не задано!");
    }

    @Override
    public String toString() {
            return name;
    }
}
