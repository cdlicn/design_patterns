package com.cdlicn.pattern.singlenton.demo7;

import java.io.*;

/**
 * 反射破坏单例模式
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 从文件中读取数据（对象）
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        // 1. 创建独享输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/li/note/design_patterns/src/main/java/com/cdlicn/pattern/singlenton/demo7/a.txt"));
        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();

        System.out.println(instance);

        // 释放资源
        ois.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws IOException {
        // 1. 获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/li/note/design_patterns/src/main/java/com/cdlicn/pattern/singlenton/demo7/a.txt"));
        // 3. 写对象
        oos.writeObject(instance);
        // 4. 释放资源
        oos.close();
    }

}
