package com.designpattern.prototype;

import java.io.*;

/**
 * @author libo
 * @ClassName Protype
 * @Description: TODO（这里用一句话描述这个类的作用)
 * @date 2018/12/25 16:58
 */
public class Protype implements Cloneable,Serializable {
    private String name;
    private Integer age;

    public Protype(String name,int age){
        this.name = name;
        this.age  = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Protype clone() throws CloneNotSupportedException {
        Protype protype =(Protype)super.clone();
        return protype;
    }

    public  Protype deepClone() throws IOException, ClassNotFoundException {
        /**写入队对象的二进制流*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return  (Protype)ois.readObject();
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Protype protype = new Protype("libo",25);
        Protype clone1 = protype.clone();
        Protype clone2 = protype.deepClone();
        System.out.println(protype.getName() == clone1.getName());
        System.out.println(protype.getName() == clone2.getName());
    }
}
