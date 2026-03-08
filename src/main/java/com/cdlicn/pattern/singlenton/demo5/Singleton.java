package com.cdlicn.pattern.singlenton.demo5;

/**
 * 静态内部类方法
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {
    }

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
