package com.designpattern.singleton;

/**
 * @author libo
 * @ClassName Singleton
 * @Description: 单例模式
 * @date 2018/12/25 16:44
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){

    }
    /***
     * @Author libo
     * @Description 方法一 线程不安全
     * @Date 16:45 2018/12/25
     * @return com.designpattern.singleton.Singleton
     */
    public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /***
     * @Author libo
     * @Description /
     * @Date 16:47 2018/12/25
     * @return com.designpattern.singleton.Singleton
     *
     * 似乎解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null，并创建对象的时候才需要加锁，性能有一定的提升。但是，这样的情况，还是有可能有问题的，看下面的情况：在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。这样就可能出错了，我们以A、B两个线程为例：

    a>A、B线程同时进入了第一个if判断

    b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();

    c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。

    d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。

    e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
     */

    public Singleton getInstance2(){
        if(instance == null){
            synchronized (instance){
                instance = new Singleton();
            }
        }
        return  instance;
    }

    /***
     * @Author libo
     * @Description //通过静态内部类实现
     * @Date 16:49 2018/12/25
     * @return com.designpattern.singleton.Singleton
     */
    public static Singleton getInstance3(){
        return  SingletonFactory.singleton;
    }
    
    private static class SingletonFactory{
        private static  Singleton singleton = new Singleton();
    }
}
