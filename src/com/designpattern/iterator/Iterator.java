package com.designpattern.iterator;

/**
 * Created by lenovo on 2017/11/8.
 */
public interface Iterator {
        /*取得前一个元素*/
        Object previous();

        /*取得后一个元素*/
        Object next();

        boolean hasNext();

        /*取得第一个元素*/
        Object first();

}
