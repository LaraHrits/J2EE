public class VisitorDemo {
    public static void main(String[] args) {
        ElementVisitor visitor = new ElementVisitor();
        GnomeFactory gnomeFactory = new GnomeFactory();
        HalfOrcFactory halfOrcFactory = new HalfOrcFactory();

        Character bard = new Character("John", ClassFactory.getClass("Bard"), gnomeFactory.create());
        bard.addClassBonuses();
        bard.addRaceBonuses();
        bard.accept(visitor);

        System.out.println();

        Character fighter = new Character("Alex", ClassFactory.getClass("Fighter"), halfOrcFactory.create());
        fighter.addClassBonuses();
        fighter.addRaceBonuses();
        fighter.accept(visitor);
    }
}