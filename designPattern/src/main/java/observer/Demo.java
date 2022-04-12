package observer;

/**
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserverA());
        subject.addObserver(new ConcreteObserverB());
        subject.notifyObserver();
    }
}
