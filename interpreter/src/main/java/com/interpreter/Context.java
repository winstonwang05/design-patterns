package com.interpreter;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Context
 * @Description: 上下文  存储和获取变量信息
 * @Author: Winston
 * @Date: 2025/11/16 13:46
 * @Version: 1.0
 */
public class Context {

    private Map<VariableTerminalExpression, Integer> map = new HashMap<>();

    public void assign(VariableTerminalExpression left, int number) {
        map.put(left, number);
    }

    public Integer getValue(VariableTerminalExpression expression) {
        return map.get(expression);
    }
}