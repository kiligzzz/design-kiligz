package com.kiligz.design.structure.composite;


import lombok.Data;

import java.util.List;

/**
 * 员工
 *
 * @author Ivan
 * @date 2022/8/29 16:01
 */
@Data
public class Employee {
    private String name;
    private List<Employee> subordinates;
}
