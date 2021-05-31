package com.yuwei.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色
 * @author yuwei
 * @date 2021/5/31 23:11
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
