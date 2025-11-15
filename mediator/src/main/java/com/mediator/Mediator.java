package com.mediator;

/**
 * @ClassName: Mediator
 * @Description: 中介者接口
 * @Author: Winston
 * @Date: 2025/11/15 11:31
 * @Version: 1.0
 */
public interface Mediator {
     void contact(String message, Colleague colleague);
}