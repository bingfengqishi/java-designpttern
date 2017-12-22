package com.designpattern.templatemethod;

/**
 * Created by lenovo on 2017/12/22.
 */
public abstract class AbstractCalculator {

    public int calculte(String  exp,String opt){
        int [] arry = split(exp,opt);
        return calculte(arry[0],arry[1]);
    }

    abstract  public  int calculte(int a,int b);

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
