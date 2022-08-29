package com.kiligz.design.behavior.strategy.support;

/**
 * 电脑
 *
 * @author Ivan
 * @date 2022/8/29 17:02
 */
public class Computer implements GameMachineStrategy {
    private static final String computer = "computer";

    @Override
    public void play() {
        playWith(computer);
    }
}
