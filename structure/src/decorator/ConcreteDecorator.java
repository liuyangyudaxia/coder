package decorator;

/**
 * 具体装饰角色
 * @author yuwei
 * @date 2021/5/30 15:53
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    private void addFunction() {
        System.out.println("为具体构件角色增加额外的功能");
    }
}
