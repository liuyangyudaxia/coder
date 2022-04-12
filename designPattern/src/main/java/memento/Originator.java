package memento;

/**
 * 发起人-备忘录信息来源
 * @author yuwei
 * @date 2021/5/31 23:19
 */
public class Originator {
    /**
     * 信息
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
