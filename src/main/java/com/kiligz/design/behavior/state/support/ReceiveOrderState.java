package com.kiligz.design.behavior.state.support;

import com.kiligz.design.behavior.state.State;

/**
 * ζ₯εηΆζ
 *
 * @author Ivan
 * @date 2022/8/31 16:12
 */
public class ReceiveOrderState implements State {
    @Override
    public void doAction() {
        System.out.println("[ Receive Order ]");
    }
}
