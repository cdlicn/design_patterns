package com.cdlicn.pattern.mediator;

/**
 * 具体的同事角色类
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 获取信息的方法
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取信息：" + message);
    }

}
