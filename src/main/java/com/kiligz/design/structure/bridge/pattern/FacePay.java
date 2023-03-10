package com.kiligz.design.structure.bridge.pattern;

import com.kiligz.design.structure.bridge.channel.PayChannel;

/**
 * 面容支付
 *
 * @author Ivan
 * @date 2022/8/26 11:46
 */
public class FacePay extends PayPattern {
    public FacePay(PayChannel payChannel) {
        super(payChannel);
    }

    @Override
    public void pay() {
        print("face");
    }
}
