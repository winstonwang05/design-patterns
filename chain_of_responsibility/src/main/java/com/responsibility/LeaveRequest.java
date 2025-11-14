package com.responsibility;


/**
 * @ClassName: LeaveRequest
 * @Description: 请假条类
 * @Author: Winston
 * @Date: 2025/11/14 18:15
 * @Version: 1.0
 */
public class LeaveRequest {
    private String name;
    private int dayNumber;
    private String content;

    public LeaveRequest(String content, int dayNumber, String name) {
        this.content = content;
        this.dayNumber = dayNumber;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}