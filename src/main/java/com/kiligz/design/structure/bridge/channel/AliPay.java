package com.kiligz.design.structure.bridge.channel;

/**
 * 支付宝支付
 *
 * @author Ivan
 * @date 2022/8/26 11:42
 */
public class AliPay implements PayChannel {
    @Override
    public String channel() {
        return "aliPay:";
    }
}
