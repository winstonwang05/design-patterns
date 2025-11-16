package com.interpreter;


/**
 * @ClassName: PlusNonTerminalExpression
 * @Description: 减法类 非终结符表达式
 * @Author: Winston
 * @Date: 2025/11/16 13:49
 * @Version: 1.0
 */
public class MinusNonTerminalExpression extends AbstractExpression{

    private AbstractExpression left;
    private AbstractExpression right;

    public MinusNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")";
    }
}