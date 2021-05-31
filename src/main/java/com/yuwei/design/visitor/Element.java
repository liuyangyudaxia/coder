package com.yuwei.design.visitor;

/**
 * 抽象元素类
 * @author yuwei
 * @date 2021/5/31 23:04
 */
public interface Element {
    void accept(Visitor visitor);
}
