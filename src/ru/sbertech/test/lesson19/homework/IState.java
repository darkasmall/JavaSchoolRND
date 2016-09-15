package ru.sbertech.test.lesson19.homework;

/**
 * Created by Daria on 15.09.2016.
 */
public interface IState {
    public IState transition(Object o);
    public boolean isFinal();
}
