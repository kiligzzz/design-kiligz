package com.kiligz.design.structure.adapter.objectAdapter;

/**
 * 手机适配器，把手机对象当作电脑来用，实际调用的还是手机的方法
 *
 * @author Ivan
 * @date 2022/8/25 10:14
 */
public class CellphoneAdapter implements Computer {
    private final Cellphone cellphone;

    public CellphoneAdapter(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public void playGames() {
        cellphone.playGames();
    }

    @Override
    public void work() {
        cellphone.callUp();
    }
}
