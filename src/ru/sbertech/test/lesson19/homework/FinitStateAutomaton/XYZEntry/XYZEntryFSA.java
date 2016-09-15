package ru.sbertech.test.lesson19.homework.FinitStateAutomaton.XYZEntry;

import ru.sbertech.test.lesson19.homework.FinitStateAutomaton.FSA;
import ru.sbertech.test.lesson19.homework.IState;

/**
 * Created by Daria on 15.09.2016.
 */
public class XYZEntryFSA implements FSA {
    private static IState currentState = new AState();

    @Override
    public boolean recognize(String inputString) {
        for(Character c : inputString.toCharArray()){
            currentState = currentState.transition(c);
            if (currentState.isFinal()){
                return true;
            }
        }
        return false;
    }
}
