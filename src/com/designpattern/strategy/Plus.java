package com.designpattern.strategy;

/**
 * Created by lenovo on 2017/12/22.
 */
public class Plus extends  AbstractCalculator implements  ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
