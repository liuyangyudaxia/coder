package proxy;

/**
 * 真实主题
 * @author yuwei
 * @date 2021/5/27 23:09
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
