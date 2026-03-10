package com.cdlicn.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();

        System.out.println("===============================");
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();

    }
}
