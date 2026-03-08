package com.cdlicn.pattern.factory.config_factory;

import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            // 2.3 从p集合中获取全类名，并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                System.out.println(key);
                String className = p.getProperty((String) key);
                System.out.println(className);
                // 通过反射技术创建对象
//                Class clazz = Class.forName(className);
//                Coffee coffee = (Coffee) clazz.getDeclaredConstructor().newInstance();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
