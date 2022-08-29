package com.kiligz.design.behavior.strategy;

import com.kiligz.design.behavior.strategy.support.GameMachineStrategy;
import lombok.AllArgsConstructor;

/**
 *
 *
 * @author Ivan
 * @date 2022/8/29 17:04
 */
@AllArgsConstructor
public class Game {
    private GameMachineStrategy strategy;

    public void play() {
        strategy.play();
    }
}
