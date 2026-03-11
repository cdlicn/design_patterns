package com.cdlicn.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        // 创建租房者对象
        Tenant tenant = new Tenant("张三", mediator);
        // 创建房主对象
        HouseOwner houseOwner = new HouseOwner("李四", mediator);

        // 中介者要知道具体的房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("我要租房");
        houseOwner.contact("有空房");

    }
}
