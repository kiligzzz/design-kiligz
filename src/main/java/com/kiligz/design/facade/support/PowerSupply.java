package com.kiligz.design.facade.support;

/**
 * 电源
 *
 * @author Ivan
 * @date 2022/8/26 17:28
 */
public class PowerSupply {
    public void startup() {
        System.out.println("[powerSupply startup]");
    }

    public void shutdown() {
        System.out.println("[powerSupply shutdown]");
    }
}
