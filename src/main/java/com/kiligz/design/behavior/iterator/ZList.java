package com.kiligz.design.behavior.iterator;

import java.util.Iterator;

/**
 * 迭代器模式，如将一个数组转为迭代器遍历
 *
 * @author Ivan
 * @date 2022/9/1 17:37
 */
public class ZList<T> implements Iterable<T>, Iterator<T> {
    private int index;
    private final T[] ts;

    public ZList(T[] ts) {
        this.ts = ts;
    }

    @Override
    public Iterator<T> iterator() {
        return new ZList<>(ts);
    }

    @Override
    public boolean hasNext() {
        return index < ts.length;
    }

    @Override
    public T next() {
        return ts[index++];
    }
}
