package com.responsibility;


/**
 * @ClassName: Handler
 * @Description: 抽象处理器类
 * @Author: Winston
 * @Date: 2025/11/14 18:16
 * @Version: 1.0
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int startDay;
    private int endDay;

    public Handler(int endDay, int startDay) {
        this.endDay = endDay;
        this.startDay = startDay;
    }

    private Handler preHandler;

    public void setPreHandler(Handler preHandler) {
        this.preHandler = preHandler;
    }

    /**
     * 设置上级领导对象 ，上级领导是在客户端设置好了的
     * @param handler 上级领导对象
     */
    Handler(Handler handler) {
        this.preHandler = handler;
    }

    public abstract void handleLeaveRequest(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest leaveRequest) {
        this.handleLeaveRequest(leaveRequest);
        /**
         * 如果上级领导存在，并且天数超过当前领导对象需要 给上级领导处理
         */
        if (this.preHandler != null && leaveRequest.getDayNumber() > this.endDay) {
            this.preHandler.submit(leaveRequest);
        }
    }
}