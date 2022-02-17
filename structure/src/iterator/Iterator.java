package iterator;

/**
 * 抽象迭代器
 * @author yuwei
 * @date 2021/5/31 22:56
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
