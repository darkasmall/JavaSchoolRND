package ru.sbertech.test.lesson18.homework.DecoratorExample;

/**
 * Created by Daria on 09.09.2016.
 */
public class Constant extends SimpleFormula{

    Constant(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
