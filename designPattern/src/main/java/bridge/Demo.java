package bridge;

/**
 * 桥接模式
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        //实现类可以多维度变化
        Implementor implementor = new ConcreteImplementorA();
        //继承类可以多维度变化，并通过构造器连接起来
        Abstraction abstraction = new RefinedAbstraction(implementor);
    }
}
