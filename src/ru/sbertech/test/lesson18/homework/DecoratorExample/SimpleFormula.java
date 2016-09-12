package ru.sbertech.test.lesson18.homework.DecoratorExample;

/**
 * Created by Daria on 09.09.2016.
 */
public abstract class SimpleFormula extends Formula{
    protected Double value;

    @Override
    public Double calculate() throws Exception {
        return value;
    }
}
