package com.kiligz.test;

import com.kiligz.design.behavior.templateMethod.Mac;
import com.kiligz.design.behavior.templateMethod.Windows;

/**
 * @author Ivan
 * @date 2022/8/31 14:30
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        Mac mac = new Mac();
        mac.startup();

        Windows windows = new Windows();
        windows.startup();
    }
}
