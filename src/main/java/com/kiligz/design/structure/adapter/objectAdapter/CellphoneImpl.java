package com.kiligz.design.structure.adapter.objectAdapter;

/**
 * 手机类
 *
 * @author Ivan
 * @date 2022/8/25 10:21
 */
public class CellphoneImpl implements Cellphone {
    @Override
    public void playGames() {
        System.out.println("play game.");
    }

    @Override
    public void callUp() {
        System.out.println("call up.");
    }
}
