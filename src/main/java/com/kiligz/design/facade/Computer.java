package com.kiligz.design.facade;

import com.kiligz.design.facade.support.Cpu;
import com.kiligz.design.facade.support.PowerSupply;

/**
 * 门面（外观），电脑
 *
 * @author Ivan
 * @date 2022/8/26 17:30
 */
public class Computer {
    private final PowerSupply powerSupply;
    private final Cpu cpu;

    public Computer() {
        powerSupply = new PowerSupply();
        cpu = new Cpu();
    }

    public void startup() {
        powerSupply.startup();
        cpu.startup();
    }

    public void shutdown() {
        cpu.shutdown();
        powerSupply.shutdown();
    }
}
