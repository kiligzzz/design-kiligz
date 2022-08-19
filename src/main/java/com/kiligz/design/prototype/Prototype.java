package com.kiligz.design.prototype;

import java.io.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 原型模式接口，提供默认的浅拷贝、深拷贝（序列化方式）方法，浅拷贝需调用实体类实现clone()方法
 *
 * @author Ivan
 * @date 2022/8/19 11:58
 */
@SuppressWarnings("unchecked")
public interface Prototype extends Cloneable, Serializable {

    static <T> T shallowCopy(T t) throws Exception {
        return (T) t.getClass().getDeclaredMethod("clone").invoke(t);
    }

    static <T> T deepCopy(T from) throws Exception {
        T to;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutput oo = new ObjectOutputStream(bos)
        ) {
            oo.writeObject(from);
            oo.flush();
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInput oi = new ObjectInputStream(bis)
            ) {
                to = (T) oi.readObject();
            }
        }
        return to;
    }
}
