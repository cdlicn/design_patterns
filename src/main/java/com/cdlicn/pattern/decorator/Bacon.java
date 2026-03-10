package com.cdlicn.pattern.decorator;

/**
 * 培根类（具体的装饰者角色）
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        // 计算价格
        return getFastFood().cost() + getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
