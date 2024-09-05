package com.example.simplecalulatorproject;
@FunctionalInterface
interface TwoElementMathOperation
{
    double perform(double x, double y);
}

class MathEngine {
    private double accumulator = 0;
    private double screen = 0;

    TwoElementMathOperation operationToPerform = (x,y) -> y;

    void numberPressed(int pressedNumber)
    {
        screen *= 10;
        screen += pressedNumber;
    }

    void plusPressed() {
        accumulator = operationToPerform.perform(accumulator, screen);
        screen = 0;

        operationToPerform = (x,y) -> x+y;
    }

    void minusPressed() {
        accumulator = operationToPerform.perform(accumulator, screen);
        screen = 0;

        operationToPerform = (x,y) -> x-y;
    }

    void muliplyPressed() {
        accumulator = operationToPerform.perform(accumulator, screen);
        screen = 0;

        operationToPerform = (x,y) -> x*y;
    }

    void dividePressed() {
        accumulator = operationToPerform.perform(accumulator, screen);
        screen = 0;

        operationToPerform = (x,y) -> x/y;
    }

    void equalsPressed() {
        accumulator = operationToPerform.perform(accumulator, screen);
        screen = accumulator;

        operationToPerform = (x,y) -> x;
    }

    String getScreenValue()
    {
        return Double.toString(screen);
    }
    public void clearScreen() {
        screen = 0;
    }

    public void clearAccumulator() {
        accumulator = 0;
        operationToPerform = (x,y) -> y;
    }

    public void sqrtPressed() {

        screen = Math.sqrt(screen);
        accumulator = screen;
        operationToPerform = (x,y) -> x;
    }

    public void changeSign() {
        screen*=-1;
    }
}
