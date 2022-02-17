package adapter;

/**
 * 类适配类
 * @author yuwei
 * @date 2021/5/30 15:22
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
