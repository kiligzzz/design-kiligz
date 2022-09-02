package com.kiligz.design.behavior.interpreter.support;

import com.kiligz.design.behavior.interpreter.Context;
import com.kiligz.design.behavior.interpreter.Expression;

/**
 * 自减解释器
 *
 * @author Ivan
 * @date 2022/9/2 11:34
 */
public class MinusExpression implements Expression {
    @Override
    public void interpreter(Context context) {
        int parse = Integer.parseInt(context.getInput());
        parse--;
        context.setInput(parse + "");
        context.setOutput(parse);
    }
}
