package com.designpattern.templatemethod;

/**
 * Created by lenovo on 2017/12/22.
 */
public class TemplateMethodTestDemo {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculte(exp, "\\+");
        System.out.println(result);
    }
}
