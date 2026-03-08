package com.cdlicn.pattern.builder.demo1;

public abstract class Builder {

    // 声明Bike类的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    // 构建自行车
    public abstract Bike build();

//    public Bike construct() {
//        this.buildFrame();
//        this.buildSeat();
//        return this.build();
//    }

}
