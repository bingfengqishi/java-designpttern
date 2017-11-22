package com.designpattern.iterator;

/**
 * Created by lenovo on 2017/11/8.
 */
public class MyCollection implements Collection {

    public String string[] = {"A","B","C","D","E"};

    @Override
    public Iterator iterrator() {
        return new MyIterator(this);
    }
    @Override
    public Object get(int i) {
        return  string[i];
    }
    @Override
    public int size() {
        return string.length;
    }
}
