package com.kiligz.design.builder;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * 建造者模式（lombok简化，@Builder可添加参数指定功能）
 *
 * @author Ivan
 * @date 2022/8/19 10:35
 */
@Builder
@Data
public class Computer {
    private final String name;
    @NonNull
    private final Cpu cpu;
    @NonNull
    private final Graphics graphics;

    public void info() {
        System.out.printf("%s:[ %s ] [ %s ]%n", name, cpu, graphics);
    }
}
