package com.kiligz.design.structure.adapter.defaultAdapter;

/**
 * 工作电脑，只用来工作，不用所有方法都实现
 *
 * @author Ivan
 * @date 2022/8/25 10:08
 */
public class WorkComputer extends ComputerAdapter {
    @Override
    public void work() {
        System.out.println("work.");
    }
}
