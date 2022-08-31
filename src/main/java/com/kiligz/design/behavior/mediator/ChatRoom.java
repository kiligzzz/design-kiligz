package com.kiligz.design.behavior.mediator;

import java.time.LocalDateTime;

/**
 * 聊天室
 *
 * @author Ivan
 * @date 2022/8/31 17:28
 */
public class ChatRoom {
    public static void showMsg(User user, String msg) {
        System.out.printf("%s [%s] : %s%n", LocalDateTime.now(),user.getName(), msg);
    }
}
