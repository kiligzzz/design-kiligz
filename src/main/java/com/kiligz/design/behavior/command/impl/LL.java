package com.kiligz.design.behavior.command.impl;

import com.kiligz.design.behavior.command.Command;
import com.kiligz.design.behavior.command.File;

/**
 * @author Ivan
 * @date 2022/8/31 16:47
 */
public class LL implements Command {
    @Override
    public void execute(File file) {
        System.out.println(file.getName() + "[" + file.getCreateTime() + "]");
    }
}
