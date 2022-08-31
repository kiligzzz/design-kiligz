package com.kiligz.design.behavior.dutyChain;

/**
 * 直属领导
 *
 * @author Ivan
 * @date 2022/8/31 10:30
 */
public class Leader extends Approver {
    public Leader(String name) {
        super(name);
    }

    @Override
    public void approve(String requestName) {
        approve("leader", requestName);
    }
}
