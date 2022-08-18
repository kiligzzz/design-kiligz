package com.kiligz.design.factory.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 显卡
 *
 * @author Ivan
 * @date 2022/8/18 23:11
 */
@AllArgsConstructor
@NoArgsConstructor
public class Graphics extends Computer {
    @Getter
    private String label;

    @Override
    public void info() {
        System.out.printf("[ %s ]:[ graphics ]%n", label);
    }
}
