package com.kiligz.design.behavior.command;

import com.kiligz.design.behavior.command.impl.HELP;

/**
 * @author Ivan
 * @date 2022/8/31 16:58
 */
public class CommandUtil {
    private static final String prefix = "com.kiligz.design.behavior.command.impl.";

    public static Command getCommand(String command) {
        try {
            Class<?> clazz = Class.forName(prefix + command.toUpperCase());
            return (Command) clazz.newInstance();
        } catch (Exception e) {
            System.out.println("Command is valid." + e);
        }
        return new HELP();
    }
}
