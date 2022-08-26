package com.kiligz.design.structure.adapter.classAdapter;

/**
 * 手机适配器，继承手机类，实现电脑接口，只需实现手机类中没有的方法
 *
 * @author Ivan
 * @date 2022/8/25 10:35
 */
public class CellphoneAdapter extends Cellphone implements Computer {
    @Override
    public void work() {
        System.out.println("work.");
    }
}
