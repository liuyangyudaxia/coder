package visitor;

/**
 * 抽象访问者
 * @author yuwei
 * @date 2021/5/31 23:07
 */
public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
