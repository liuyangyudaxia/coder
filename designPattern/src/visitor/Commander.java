package visitor;

/**
 * 指挥官
 * @author yuwei
 */
public class Commander extends Unit {
    public Commander(Unit[] children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}
