package visitor;

/**
 * @author yuwei
 */
public class SoldierVisitor implements UnitVisitor{
    @Override
    public void visitSoldier(Unit soldier) {
        System.out.println("good to see you " + soldier);
    }

    @Override
    public void visitSergeant(Unit sergeant) {

    }

    @Override
    public void visitCommander(Unit commander) {

    }
}
