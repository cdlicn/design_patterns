package com.cdlicn.pattern.factory.factory_method;

/**
 * 拿铁咖啡工厂，专门用来生产拿铁咖啡
 */
public class LatterCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
