package com.cdlicn.pattern.visitor;

/**
 * 抽象访问者角色类
 */
public interface Person {

    // 喂食宠物猫
    void feed(Cat cat);

    // 喂食重复狗
    void feed(Dog dog);

}
