package memento;

/**
 * 备忘录模式
 * @author yuwei
 * @date 2021/5/31 23:18
 */
public class Demo {
    public static void main(String[] args) {
        Originator or = new Originator();
        or.setState("S0");
        System.out.println("初始状态:" + or.getState());

        Caretaker cr = new Caretaker();
        //保存状态
        cr.setMemento(or.createMemento());

        or.setState("S1");
        System.out.println("新的状态:" + or.getState());
        //恢复状态
        or.restoreMemento(cr.getMemento());
        System.out.println("恢复状态:" + or.getState());
    }
}