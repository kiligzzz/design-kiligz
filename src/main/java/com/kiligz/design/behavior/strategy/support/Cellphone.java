package com.kiligz.design.behavior.strategy.support;

/**
 * 手机
 *
 * @author Ivan
 * @date 2022/8/29 17:02
 */
public class Cellphone implements GameMachineStrategy {
    private static final String cellphone = "cellphone";

    @Override
    public void play() {
        playWith(cellphone);
    }
}
