package adapter;

/**
 * 适配者
 * 被访问和适配的现存组件库中的组件接口
 * @author yuwei
 */
public class Adaptee {
    /**
     * 被适配者自己的方法
     */
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用");
    }
}
