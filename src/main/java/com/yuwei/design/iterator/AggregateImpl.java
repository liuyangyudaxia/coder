package com.yuwei.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuwei
 * @date 2021/5/31 22:59
 */
public class AggregateImpl implements Aggregate {
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
