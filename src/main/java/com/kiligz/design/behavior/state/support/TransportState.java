package com.kiligz.design.behavior.state.support;

import com.kiligz.design.behavior.state.State;

/**
 * 运输状态
 *
 * @author Ivan
 * @date 2022/8/31 16:12
 */
public class TransportState implements State {
    @Override
    public void doAction() {
        System.out.println("[ Transport ]");
    }
}
