package singleton;

/**
 * 单例模式-懒汉式
 * @author yuwei
 * @date 2021/5/24 23:46
 */
public class LazySingleton {

    /**
     * 保证instance在所有线程同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * 私有避免实例化
     */
    private LazySingleton() {
    }

    /**
     * 需要时再创建，即懒
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
