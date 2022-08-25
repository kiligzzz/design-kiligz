package com.kiligz.test;

import com.kiligz.design.adapter.objectAdapter.Cellphone;
import com.kiligz.design.adapter.objectAdapter.CellphoneAdapter;
import com.kiligz.design.adapter.objectAdapter.CellphoneImpl;
import com.kiligz.design.adapter.objectAdapter.Computer;

/**
 * @author Ivan
 * @date 2022/8/25 10:19
 */
public class TestAdapter {
    public static void main(String[] args) {
//        testObjectAdapter();
        testClassAdapter();
    }

    public static void testObjectAdapter() {
        Cellphone cellphone = new CellphoneImpl();
        Computer computer = new CellphoneAdapter(cellphone);
        computer.playGames();
        computer.work();
    }

    public static void testClassAdapter() {
        com.kiligz.design.adapter.classAdapter.Computer computer = new com.kiligz.design.adapter.classAdapter.CellphoneAdapter();
        computer.playGames();
        computer.work();
    }
}
