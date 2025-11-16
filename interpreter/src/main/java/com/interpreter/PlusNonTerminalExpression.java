package com.interpreter;


/**
 * @ClassName: PlusNonTerminalExpression
 * @Description: 加法类 非终结符表达式
 * @Author: Winston
 * @Date: 2025/11/16 13:49
 * @Version: 1.0
 */
public class PlusNonTerminalExpression extends AbstractExpression{

    private AbstractExpression left;
    private AbstractExpression right;

    public PlusNonTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "+" + right.toString() + ")";
    }
}