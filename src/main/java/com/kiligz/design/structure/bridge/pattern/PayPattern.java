package com.kiligz.design.structure.bridge.pattern;

import com.kiligz.design.structure.bridge.channel.PayChannel;

/**
 * 支付模式
 *
 * @author Ivan
 * @date 2022/8/26 11:39
 */
public abstract class PayPattern {
    protected PayChannel payChannel;

    protected PayPattern(PayChannel payChannel) {
        this.payChannel = payChannel;
    }

    public abstract void pay();

    protected void print(String pattern) {
        System.out.println(payChannel.channel() + pattern);
    }
}
