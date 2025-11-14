package com.responsibility;


/**
 * @ClassName: GroupHandler
 * @Description: 具体处理器，继承 抽象处理器并重写方法
 * @Author: Winston
 * @Date: 2025/11/14 18:23
 * @Version: 1.0
 */
public class GroupHandler extends Handler {

    public GroupHandler() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假了" + leaveRequest.getDayNumber() + "天" + "原因是：" + leaveRequest.getContent());
        System.out.println("小组处理完毕！");
    }
}