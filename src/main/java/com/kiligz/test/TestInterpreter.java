package com.kiligz.test;

import com.kiligz.design.behavior.interpreter.Context;
import com.kiligz.design.behavior.interpreter.Expression;
import com.kiligz.design.behavior.interpreter.MinusExpression;
import com.kiligz.design.behavior.interpreter.PlusExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan
 * @date 2022/9/2 11:03
 */
public class TestInterpreter {
    public static void main(String[] args) {
        List<Expression> list = new ArrayList<>();
        list.add(new PlusExpression());
        list.add(new MinusExpression());
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new PlusExpression());

        Context context = new Context("0");
        for (Expression expression : list) {
            expression.interpreter(context);
        }

        System.out.println(context.getOutput());
    }
}
