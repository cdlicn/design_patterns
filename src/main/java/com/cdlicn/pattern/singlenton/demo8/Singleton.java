package com.cdlicn.pattern.singlenton.demo8;

/**
 * 静态内部类方法
 */
public class Singleton {

    private static boolean initialized = false;

    // 私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            // 判断initialized的值是否为true，true->非第一次访问，直接抛出异常
            if (initialized) {
                throw new RuntimeException("不能创建多个对象");
            }
            initialized = true;
        }
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
