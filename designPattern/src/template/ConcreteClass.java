package template;

/**
 * @author yuwei
 * @date 2021/5/30 17:35
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("子类方法1");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("子类方法2");
    }
}
