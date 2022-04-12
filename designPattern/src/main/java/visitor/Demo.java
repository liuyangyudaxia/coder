package visitor;

/**
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier(new Unit[]{});
        Soldier soldier2 = new Soldier(new Unit[]{});
        Soldier soldier3 = new Soldier(new Unit[]{});
        Sergeant sergeant = new Sergeant(new Unit[]{soldier1, soldier2, soldier3});
        Commander commander = new Commander(new Unit[]{sergeant});
        commander.accept(new CommanderVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new SoldierVisitor());
    }
}
