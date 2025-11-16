package com.interpreter;


/**
 * @ClassName: Client
 * @Description: 客户端 -- 测试用例
 * @Author: Winston
 * @Date: 2025/11/16 13:57
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        VariableTerminalExpression a = new VariableTerminalExpression("a");
        VariableTerminalExpression b = new VariableTerminalExpression("b");
        VariableTerminalExpression c = new VariableTerminalExpression("c");
        Context context = new Context();
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        AbstractExpression expression = new PlusNonTerminalExpression(a, new MinusNonTerminalExpression(b, c));

        System.out.println(expression.toString() + " = " + expression.interpret(context));

    }
}