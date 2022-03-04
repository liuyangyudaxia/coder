package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuwei
 * @date 2021/5/31 22:37
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague colleague : colleagueList) {
            if (!colleague.equals(cl)) {
                colleague.receive();
            }
        }
    }
}
