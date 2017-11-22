package com.designpattern.iterator;

/**
 * Created by lenovo on 2017/11/8.
 */
public class Test {
    public static void main(String[] args) {
            Collection collection = new MyCollection();
            Iterator iterator = collection.iterrator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
    }
}
