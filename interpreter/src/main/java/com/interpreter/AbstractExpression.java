package com.interpreter;


/**
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式，抽象方法将非终结符和终结符联系
 * @Author: Winston
 * @Date: 2025/11/16 13:45
 * @Version: 1.0
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}