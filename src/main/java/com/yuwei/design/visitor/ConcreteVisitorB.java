package com.yuwei.design.visitor;

/**
 * @author yuwei
 * @date 2021/5/31 23:09
 */
public class ConcreteVisitorB  implements Visitor{
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问->" + element.operationB());
    }
}
