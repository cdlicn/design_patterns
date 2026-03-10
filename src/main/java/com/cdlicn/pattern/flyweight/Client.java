package com.cdlicn.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        // 获取 I 图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        // 获取 L 图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("绿色");

        // 获取 O 图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("灰色");

        // 获取 O 图形对象
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box3.display("红色");

        System.out.println(box3 == box4);
    }
}
