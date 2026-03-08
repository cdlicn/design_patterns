package com.cdlicn.pattern.prototype.test1;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 创建原型对象
        Citation citation = new Citation();
        // 创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/li/note/design_patterns/src/main/java/com/cdlicn/pattern/prototype/test1/a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/li/note/design_patterns/src/main/java/com/cdlicn/pattern/prototype/test1/a.txt"));
        // 读取对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        citation1.getStu().setName("李四");

        citation.show();
        citation1.show();
    }
}
