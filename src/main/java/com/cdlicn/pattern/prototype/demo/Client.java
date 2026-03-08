package com.cdlicn.pattern.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        RealizeType r1 = new RealizeType();

        // 调用clone方法进行对象的克隆
        RealizeType r2 = r1.clone();

        System.out.println(r1 == r2);
    }
}
