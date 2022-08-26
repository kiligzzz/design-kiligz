package com.kiligz.design.bridge.channel;

/**
 * 微信支付
 *
 * @author Ivan
 * @date 2022/8/26 11:42
 */
public class WeChatPay implements PayChannel {
    @Override
    public String channel() {
        return "wechatPay:";
    }
}
