package com.cdlicn.pattern.responsibility;

/**
 * 总经理类
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent());
        System.out.println("总经理审批同意");
    }
}
