package com.state;


/**
 * @ClassName: OpenConcreteState
 * @Description: 抽象具体类，继承抽象状态类
 * @Author: Winston
 * @Date: 2025/11/14 20:19
 * @Version: 1.0
 */
public class OpenConcreteState extends AbstractState{
    @Override
    public void close() {
        super.context.setCurrentState(Context.CLOSE_STATE);
        super.context.close();
        System.out.println("电梯关门");
    }

    @Override
    public void running() {
        // 不需要任何操作
    }

    @Override
    public void open() {
        System.out.println("电梯开门");
    }

    @Override
    public void stop() {
        // 不需要任何操作
    }
}