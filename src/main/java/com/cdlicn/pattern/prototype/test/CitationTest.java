package com.cdlicn.pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型对象
        Citation citation = new Citation();
        // 创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        // 克隆奖状对象
        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        /*citation.setName("张三");
        citation1.setName("李四");*/

        // 调用show方法展示
        citation.show();
        citation1.show();
    }
}
