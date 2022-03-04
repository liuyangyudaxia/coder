package visitor;

/**
 * @author yuwei
 * @date 2021/5/31 23:05
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体A操作";
    }
}
