package com.kiligz.design.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 游戏，实现Memento接口，可存档
 *
 * @author Ivan
 * @date 2022/9/1 11:06
 */
@Data
@AllArgsConstructor
public class Game implements Memento<Game> {
    private int hp;

    @Override
    public void saveMemento(String key) throws Exception {
        Memento.super.saveMemento(key);
    }
}
