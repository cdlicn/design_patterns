package com.cdlicn.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类（属于请求者角色）
 */
public class Waiter {

    // 持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        // 将cmd对象存储到list集合中
        commands.add(cmd);
    }

    // 发起命令功能
    public void orderUp() {
        System.out.println("xxx：新订单来了");
        // 遍历list集合
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }

}
