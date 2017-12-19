package com.designpattern.bridge;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class BridgeTestDemo {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable sourceable1 = new Sourceable1() ;
        bridge.setSourceable(sourceable1);
        bridge.method();

        Sourceable sourceable2 = new Sourceable2();
        bridge.setSourceable(sourceable2);
        bridge.method();

    }
}
