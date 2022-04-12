package visitor;

/**
 * @author yuwei
 */
public class SergeantVisitor implements UnitVisitor{
    @Override
    public void visitSoldier(Unit soldier) {

    }

    @Override
    public void visitSergeant(Unit sergeant) {
        System.out.println("good to see you " + sergeant);
    }

    @Override
    public void visitCommander(Unit commander) {

    }
}
