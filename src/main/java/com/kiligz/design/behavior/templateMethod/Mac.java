package com.kiligz.design.behavior.templateMethod;

/**
 * Mac电脑
 *
 * @author Ivan
 * @date 2022/8/31 14:29
 */
public class Mac extends AbstractComputer {
    @Override
    protected void startupPowerSupply() {
        System.out.println("[ mac powerSupply startup ]");
    }

    @Override
    protected void startupCpu() {
        System.out.println("[ mac cpu startup ]");
    }
}
