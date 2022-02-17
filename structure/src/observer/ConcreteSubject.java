package observer;

/**
 * 具体主题
 * @author yuwei
 * @date 2021/5/31 22:28
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("----------------");
        for (Observer observer : observerList) {
            observer.response();
        }
    }
}
