package ru.sbertech.test.lesson19.homework.FinitStateAutomaton.XYZEntry;

import ru.sbertech.test.lesson19.homework.IState;

/**
 * Created by Daria on 15.09.2016.
 */
public class AState implements IState {

    @Override
    public IState transition(Object o) {
        Character symbol = (Character) o;
        switch (symbol) {
            case 'x': return new BState();
            default: return this;
        }
    }

    @Override
    public boolean isFinal() {
        return false;
    }
}
