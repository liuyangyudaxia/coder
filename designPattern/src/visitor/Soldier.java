package visitor;

/**
 * @author yuwei
 */
public class Soldier extends Unit {
    protected Soldier(Unit[] children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSoldier(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "soldier";
    }
}
