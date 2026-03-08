package com.cdlicn.pattern.singlenton.demo3;

/**
 * 懒汉式
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量instance
    private static Singleton instance; // 智慧声明一个该类型的变量，并没有进行赋值

    // 对外提供访问方式
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
