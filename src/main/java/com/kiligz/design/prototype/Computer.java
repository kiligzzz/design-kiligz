package com.kiligz.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Ivan
 * @date 2022/8/19 12:13
 */
@Data
@AllArgsConstructor
public class Computer implements Prototype {
    private Cpu cpu;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static class Cpu implements Serializable {

    }
}
