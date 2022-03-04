package adapter;

/**
 * 对象适配器类
 * @author yuwei
 * @date 2021/5/30 15:24
 */
public class ObjectAdapter implements Target {
    private final Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //适配者的方法被适配到目标方法中执行
        adaptee.specificRequest();
    }
}
