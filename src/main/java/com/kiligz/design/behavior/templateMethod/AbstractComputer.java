package com.kiligz.design.behavior.templateMethod;

/**
 * 抽象电脑类
 *
 * @author Ivan
 * @date 2022/8/31 14:26
 */
public abstract class AbstractComputer {
    public void startup() {
        startupPowerSupply();
        startupCpu();
    }

    protected abstract void startupPowerSupply();

    protected abstract void startupCpu();
}
