package com.interpreter;


/**
 * @ClassName: VariableTerminalExpression
 * @Description: 变量类  终结符表达式
 * @Author: Winston
 * @Date: 2025/11/16 13:48
 * @Version: 1.0
 */
public class VariableTerminalExpression extends AbstractExpression{

    private String name;

    public VariableTerminalExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 从上下文对象中获取信息
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}