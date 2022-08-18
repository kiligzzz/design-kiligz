package com.kiligz.design.factory.support;

import lombok.*;

/**
 * cpu
 *
 * @author Ivan
 * @date 2022/8/18 23:11
 */
@AllArgsConstructor
@NoArgsConstructor
public class Cpu extends Computer {
    @Getter
    private String label;

    public void info() {
        System.out.printf("[ %s ]:[ cpu ]%n", label);
    }
}
