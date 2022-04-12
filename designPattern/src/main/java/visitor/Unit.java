package visitor;

import java.util.Arrays;

/**
 * @author yuwei
 */
public abstract class Unit {

    private final Unit[] children;

    protected Unit(Unit[] children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(children -> children.accept(visitor));
    }
}
