package com.designpattern.iterator;

/**
 * Created by lenovo on 2017/11/8.
 * 迭代子模式
 */
public interface Collection  {
     Iterator iterrator();

    /*取得集合的元素*/
     Object get(int i);

    /*取得集合的大小*/
     int size();
}



