package com.yuwei.design.visitor;

/**
 * 具体访问者A
 * @author yuwei
 * @date 2021/5/31 23:08
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问->" + element.operationB());
    }
}
