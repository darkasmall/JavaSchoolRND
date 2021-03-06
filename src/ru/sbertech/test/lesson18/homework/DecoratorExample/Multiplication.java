package ru.sbertech.test.lesson18.homework.DecoratorExample;

/**
 * Created by Daria on 09.09.2016.
 */
public class Multiplication extends CompoundFormula{
    public Multiplication(Formula leftOperand, Formula rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public Double calculate() throws Exception {
        return leftOperand.calculate() * rightOperand.calculate();

    }

    @Override
    public String toString() {
        return "(" + leftOperand.toString() + " * " + rightOperand.toString() + ")";
    }
}
