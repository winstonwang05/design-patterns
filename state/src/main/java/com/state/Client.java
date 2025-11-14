package com.state;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/14 20:25
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new OpenConcreteState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}