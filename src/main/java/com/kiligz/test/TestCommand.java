package com.kiligz.test;

import com.kiligz.design.behavior.command.File;
import com.kiligz.design.behavior.command.CommandUtil;

import java.time.LocalDateTime;

/**
 * @author Ivan
 * @date 2022/8/31 16:52
 */
public class TestCommand {
    public static void main(String[] args) {
        File file = new File("zyf.txt", LocalDateTime.now().toString());
        CommandUtil.getCommand("ll").execute(file);
    }
}
