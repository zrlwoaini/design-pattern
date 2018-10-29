package com.job.designpattern.simplefactory;

public class OperationMultiplication  extends Operation{

    @Override
    public double calculate() {
        return super.getNumberA() * super.getNumberB();
    }
}
