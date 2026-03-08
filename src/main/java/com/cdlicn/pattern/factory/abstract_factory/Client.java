package com.cdlicn.pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        // 创建意大利风味的工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();
        // 获取对应的拿铁咖啡和提拉米苏
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
