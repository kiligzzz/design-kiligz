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
public class User {
    @NonNull
    private final String name;
    private final String aka;
    @NonNull
    private final Integer age;
}
