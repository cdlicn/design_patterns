package com.cdlicn.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        // 创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        // 点咖啡
        Coffee coffee = store.orderCoffee("american");

        System.out.println(coffee.getName());
    }
}
