package com.kiligz.test;

import com.kiligz.design.behavior.strategy.Game;
import com.kiligz.design.behavior.strategy.support.Computer;

/**
 * @author Ivan
 * @date 2022/8/29 17:07
 */
public class TestStrategy {
    public static void main(String[] args) {
        Game game = new Game(new Computer());
        game.play();
    }
}
