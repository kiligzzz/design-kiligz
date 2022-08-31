package com.kiligz.test;

import com.kiligz.design.behavior.state.Logistics;
import com.kiligz.design.behavior.state.support.DeliveryState;
import com.kiligz.design.behavior.state.support.ReceiveOrderState;
import com.kiligz.design.behavior.state.support.TransportState;

/**
 * @author Ivan
 * @date 2022/8/31 16:19
 */
public class TestState {
    public static void main(String[] args) {
        Logistics logistics = new Logistics();
        logistics.doAction();

        logistics.setState(new DeliveryState());
        logistics.doAction();

        logistics.setState(new TransportState());
        logistics.doAction();
    }
}
