package memento;

/**
 * 备忘录
 * @author yuwei
 * @date 2021/5/31 23:18
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
