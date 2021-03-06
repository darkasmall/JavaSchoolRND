package ru.sbertech.test.lesson19.homework.FinitStateAutomaton.XYZEntry;

import ru.sbertech.test.lesson19.homework.IState;

/**
 * Created by Daria on 15.09.2016.
 */
public class BState implements IState {

    @Override
    public IState transition(Object o) {
        Character symbol = (Character) o;
        switch (symbol) {
            case 'y': return new CState();
            case 'x': return this;
            default: return new AState();
        }
    }

    @Override
    public boolean isFinal() {
        return false;
    }
}
