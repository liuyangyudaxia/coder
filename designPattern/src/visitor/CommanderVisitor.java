package visitor;

/**
 * 指挥官访问者
 * @author yuwei
 */
public class CommanderVisitor implements UnitVisitor {

  @Override
  public void visitSoldier(Unit soldier) {

  }

  @Override
  public void visitSergeant(Unit sergeant) {

  }

  @Override
  public void visitCommander(Unit commander) {
    System.out.println("good to see you " + commander);
  }
}

