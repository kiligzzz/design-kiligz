package com.kiligz.design.behavior.templateMethod;

/**
 * Windows电脑
 *
 * @author Ivan
 * @date 2022/8/31 14:31
 */
public class Windows extends AbstractComputer {
    @Override
    protected void startupPowerSupply() {
        System.out.println("[ windows powerSupply startup ]");
    }

    @Override
    protected void startupCpu() {
        System.out.println("[ windows cpu startup ]");
    }
}
