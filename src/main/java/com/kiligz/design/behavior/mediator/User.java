package com.kiligz.design.behavior.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户
 *
 * @author Ivan
 * @date 2022/8/31 17:28
 */
@Data
@AllArgsConstructor
public class User {
    private final String name;

    public void sendMsg(String msg) {
        ChatRoom.showMsg(this, msg);
    }
}
