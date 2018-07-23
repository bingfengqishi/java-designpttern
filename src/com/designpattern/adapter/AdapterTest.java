package com.designpattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Ps2 test = new Adapter();
        test.isPs2();

        Usb usb = new UserUsb();
        Adapter2 adapter2 = new Adapter2(usb);
        adapter2.isPs2();

        Adapter3 adapter3 = new Adapter3();
        adapter3.isPs2();
        adapter3.isPs3();
        adapter3.isPs4();
    }
}
