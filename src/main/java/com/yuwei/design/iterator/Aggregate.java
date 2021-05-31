package com.yuwei.design.iterator;

/**
 * 抽象聚合
 * @author yuwei
 * @date 2021/5/31 22:54
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object object);
    public Iterator getIterator();
}
