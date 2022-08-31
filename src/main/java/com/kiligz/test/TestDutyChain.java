package com.kiligz.test;

import com.kiligz.design.behavior.dutyChain.*;

/**
 * @author Ivan
 * @date 2022/8/31 10:48
 */
public class TestDutyChain {
    public static void main(String[] args) {
        Approver zyf = new Leader("zyf");
        Approver gmj = new SecondLeader("gmj");
        Approver z = new HR("z");
        zyf.setSuccessor(gmj)
                .setSuccessor(z);

        zyf.approve("kiligz");
    }
}
