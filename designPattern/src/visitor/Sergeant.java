package visitor;

/**
 * 中士
 * @author yuwei
 */
public class Sergeant extends Unit{
    protected Sergeant(Unit[] children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitSergeant(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "sergeant";
    }
}
