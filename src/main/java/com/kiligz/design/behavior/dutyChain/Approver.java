package com.kiligz.design.behavior.dutyChain;

/**
 * 批准人抽象类
 *
 * @author Ivan
 * @date 2022/8/31 10:28
 */
public abstract class Approver {
    private Approver successor;
    private final String name;

    public Approver(String name) {
        this.name = name;
    }

    public Approver setSuccessor(Approver successor) {
        this.successor = successor;
        return successor;
    }

    public abstract void approve(String requestName);

    protected void approve(String type, String requestName) {
        System.out.println("[ " + name + "(" + type + ") approve " + requestName + "]");
        if (successor != null) {
            successor.approve(requestName);
        }
    }
}
