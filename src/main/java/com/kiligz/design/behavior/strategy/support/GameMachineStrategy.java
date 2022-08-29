package com.kiligz.design.behavior.strategy.support;

/**
 * 游戏机C
 *
 * @author Ivan
 * @date 2022/8/29 16:59
 */
public interface GameMachineStrategy {
    void play();

    default void playWith(String machine) {
        System.out.println("play with " + machine);
    }
}
