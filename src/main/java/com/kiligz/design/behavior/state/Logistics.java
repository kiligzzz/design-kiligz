package com.kiligz.design.behavior.state;

import com.kiligz.design.behavior.state.support.ReceiveOrderState;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 物流
 *
 * @author Ivan
 * @date 2022/8/31 16:13
 */
@Data
@AllArgsConstructor
public class Logistics {
    private State state;

    public Logistics() {
        // 默认是接单状态
        this.state = new ReceiveOrderState();
    }

    public void doAction() {
        state.doAction();
    }
}
