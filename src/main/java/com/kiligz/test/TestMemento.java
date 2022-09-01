package com.kiligz.test;

import com.kiligz.design.behavior.memento.Game;

/**
 * @author Ivan
 * @date 2022/9/1 11:21
 */
public class TestMemento {
    public static void main(String[] args) throws Exception {
        Game game = new Game(100);
        System.out.println("origin: " + game);

        // 存档
        game.saveMemento("init");
        System.out.println(game.infoMementoMap());

        // 血量降低
        game.setHp(73);
        System.out.println("minus: " + game);

        // 恢复存档
        game = game.restoreMemento("init");
        System.out.println("restore: " + game);
    }
}
