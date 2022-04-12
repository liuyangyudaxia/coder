package composite;

/**
 * 抽象构建
 * @author yuwei
 * @date 2021/5/30 17:13
 */
public interface Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();
}
