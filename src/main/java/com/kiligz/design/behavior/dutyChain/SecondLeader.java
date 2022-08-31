package com.kiligz.design.behavior.dutyChain;

/**
 * 二级领导
 *
 * @author Ivan
 * @date 2022/8/31 10:34
 */
public class SecondLeader extends Approver {
    public SecondLeader(String name) {
        super(name);
    }

    @Override
    public void approve(String requestName) {
        approve("secondLeader", requestName);
    }
}
