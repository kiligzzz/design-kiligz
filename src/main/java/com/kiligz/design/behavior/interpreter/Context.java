package com.kiligz.design.behavior.interpreter;

import lombok.Data;

/**
 * 解释器上下文环境类；
 * 用来存储解释器的上下文环境，比如需要解释的文法
 *
 * @author Ivan
 * @date 2022/9/2 10:48
 */
@Data
public class Context {
    private String input;
    private int output;

    public Context(String input) {
        this.input = input;
    }
}
