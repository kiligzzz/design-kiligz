package com.kiligz.design.behavior.dutyChain;

/**
 * 人力
 *
 * @author Ivan
 * @date 2022/8/31 10:30
 */
public class HR extends Approver {
    public HR(String name) {
        super(name);
    }

    @Override
    public void approve(String requestName) {
        approve("hr", requestName);
    }
}
