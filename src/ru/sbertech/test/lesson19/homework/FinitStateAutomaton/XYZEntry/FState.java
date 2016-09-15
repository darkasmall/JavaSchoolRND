package ru.sbertech.test.lesson19.homework.FinitStateAutomaton.XYZEntry;

import ru.sbertech.test.lesson19.homework.IState;

/**
 * Created by Daria on 15.09.2016.
 */
public class FState implements IState {

    @Override
    public IState transition(Object o) {
        return null;
    }

    @Override
    public boolean isFinal() {
        return true;
    }
}
