package com.designpattern.strategy;

/**
 * Created by lenovo on 2017/12/22.
 */
public class StrategyTestDemo {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
