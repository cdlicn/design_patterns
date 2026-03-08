package com.cdlicn.pattern.singlenton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试使用反射破坏单例模式
 */
public class Client {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1. 获取Singleton的字节码对象
        Class<Singleton> clazz = Singleton.class;
        // 2. 获取无参构造方法
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        // 3. 取消访问检查
        cons.setAccessible(true);
        // 4. 创建对象
        Singleton s1 = cons.newInstance();
        Singleton s2 = cons.newInstance();

        System.out.println(s1 == s2);

    }

}
