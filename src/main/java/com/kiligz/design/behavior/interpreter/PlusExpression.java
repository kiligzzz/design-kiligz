package com.kiligz.design.behavior.interpreter;

/**
 * 自增解释器
 *
 * @author Ivan
 * @date 2022/9/2 10:25
 */
public class PlusExpression implements Expression {
    @Override
    public void interpreter(Context context) {
        int parse = Integer.parseInt(context.getInput());
        parse++;
        context.setInput(parse + "");
        context.setOutput(parse);
    }
}
