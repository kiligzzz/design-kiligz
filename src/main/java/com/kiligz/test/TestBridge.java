package com.kiligz.test;

import com.kiligz.design.structure.bridge.channel.AliPay;
import com.kiligz.design.structure.bridge.channel.WeChatPay;
import com.kiligz.design.structure.bridge.pattern.FacePay;
import com.kiligz.design.structure.bridge.pattern.PasswordPay;
import com.kiligz.design.structure.bridge.pattern.PayPattern;

/**
 * @author Ivan
 * @date 2022/8/26 11:51
 */
public class TestBridge {
    public static void main(String[] args) {
        PayPattern faceWithWeChatPay = new FacePay(new WeChatPay());
        faceWithWeChatPay.pay();

        PayPattern passwordWithAliPay = new PasswordPay(new AliPay());
        passwordWithAliPay.pay();
    }
}
