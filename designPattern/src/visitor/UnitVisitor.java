package visitor;

/**
 * @author yuwei
 */
public interface UnitVisitor {
    /**
     * 访问士兵
     * @param soldier 士兵
     */
    void visitSoldier(Unit soldier);

    /**
     * 访问军官
     * @param sergeant 军官
     */
    void visitSergeant(Unit sergeant);

    /**
     * 访问指挥官
     * @param commander 指挥官
     */
    void visitCommander(Unit commander);
}
