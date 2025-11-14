package com.responsibility;


/**
 * @ClassName: Client
 * @Description: 客户端 测试用例
 * @Author: Winston
 * @Date: 2025/11/14 18:28
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("感冒", 8, "张三");

        GroupHandler groupHandler = new GroupHandler();
        ManageHandler manageHandler = new ManageHandler();
        groupHandler.setPreHandler(manageHandler);
        groupHandler.submit(leaveRequest);
    }
}