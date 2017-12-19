package com.designpattern.bridge;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public abstract  class Bridge {
    private Sourceable sourceable;

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
    public void method(){
        sourceable.method();
    }
}
