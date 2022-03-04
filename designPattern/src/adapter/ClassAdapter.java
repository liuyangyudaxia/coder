package adapter;

/**
 * 类适配器类
 * 转换器，通过继承（或引用）适配者对象，把适配者接口转换到目标接口
 * 让客户按目标接口的格式访问适配者（无感知被适配到了适配者接口上）
 * @author yuwei
 * @date 2021/5/30 15:22
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        //适配者的方法被适配到目标方法中执行
        specificRequest();
    }
}
