package com.cdlicn.pattern.state.after;

public class Client {
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        // 设置当前电梯状态
        context.setLiftState(Context.CLOSING_STATE);

        context.open();

        context.close();

        context.run();

        context.stop();
    }
}
