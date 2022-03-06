package template;

/**
 * 抽象类
 * @author yuwei
 * @date 2021/5/30 17:33
 */
public abstract class AbstractClass {
    public void templateMethod() {
        abstractMethod1();
        abstractMethod2();
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
