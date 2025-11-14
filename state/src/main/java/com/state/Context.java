package com.state;


/**
 * @ClassName: Context
 * @Description: 上下文， 引用抽象状态对象
 * @Author: Winston
 * @Date: 2025/11/14 20:12
 * @Version: 1.0
 */
public class Context {

    public final static RunConcreteState RUNNING_STATE = new RunConcreteState();
    public final static StopConcreteState STOP_STATE = new StopConcreteState();
    public final static CloseConcreteState CLOSE_STATE = new CloseConcreteState();
    public final static OpenConcreteState OPEN_STATE = new OpenConcreteState();

    // 当前状态属性
    private AbstractState currentState;

    public AbstractState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
        // 设置当前上下文
       this.currentState.setContext(this);
    }

    public void open() {
        this.currentState.open();
    }
    public void close() {
        this.currentState.close();
    }

    public void run() {
        this.currentState.running();
    }

    public void stop() {
        this.currentState.stop();

    }
}