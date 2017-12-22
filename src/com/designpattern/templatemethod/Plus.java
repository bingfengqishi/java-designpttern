package com.designpattern.templatemethod;

/**
 * Created by lenovo on 2017/12/22.
 */
public class Plus extends  AbstractCalculator {
    @Override
    public int calculte(int a, int b) {
        return  a + b;
    }
}
