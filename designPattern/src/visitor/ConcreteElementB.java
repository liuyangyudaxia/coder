package visitor;

/**
 * 具体元素B
 * @author yuwei
 * @date 2021/5/31 23:05
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体B操作";
    }
}