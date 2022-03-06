package memento;

/**
 * 备忘录角色
 * @author yuwei
 * @date 2021/5/31 23:18
 */
public class Memento {
    /**
     * 备忘录记录的信息
     */
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
