package com.responsibility;


/**
 * @ClassName: ManageHandler
 * @Description: 具体处理器类， 管理层领导类
 * @Author: Winston
 * @Date: 2025/11/14 18:27
 * @Version: 1.0
 */
public class ManageHandler extends Handler{

    public ManageHandler() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }


    @Override
    public void handleLeaveRequest(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假了" + leaveRequest.getDayNumber() + "天" + "原因是：" +leaveRequest.getContent());
        System.out.println("管理层领导处理完毕!");
    }
}