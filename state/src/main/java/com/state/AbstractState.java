package com.state;


/**
 * @ClassName: AbstractState
 * @Description: 抽象状态类，引用上下文对象
 * @Author: Winston
 * @Date: 2025/11/14 20:11
 * @Version: 1.0
 */
public abstract class AbstractState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void running();

    public abstract void stop();
}