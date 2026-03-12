package com.cdlicn.pattern.visitor;

public class Client {
    public static void main(String[] args) {
        // 创建Home对象
        Home home = new Home();
        // 添加元素到home对象中
        home.add(new Cat());
        home.add(new Dog());

        // 创建主人对象
        Owner owner = new Owner();
        home.action(owner);


    }
}
