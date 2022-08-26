package com.kiligz.design.structure.bridge.pattern;

import com.kiligz.design.structure.bridge.channel.PayChannel;

/**
 * 密码支付
 *
 * @author Ivan
 * @date 2022/8/26 11:46
 */
public class PasswordPay extends PayPattern {
    public PasswordPay(PayChannel payChannel) {
        super(payChannel);
    }

    @Override
    public void pay() {
        print("password");
    }
}
