package com.kiligz.design.bridge.pattern;

import com.kiligz.design.bridge.channel.PayChannel;

/**
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
