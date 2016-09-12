package ru.sbertech.test.lesson18.homework.DecoratorExample;

/**
 * Created by Daria on 09.09.2016.
 */
public abstract class CompoundFormula extends Formula{

    protected Formula leftOperand, rightOperand;

    public CompoundFormula(Formula leftOperand, Formula rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
}
