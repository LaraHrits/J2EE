public class Demo {
    public static void main(String[] args) {
        Character fighter = new Character("Fighter", ClassFactory.getClass("Fighter"));
        fighter.talk();

        fighter.addClassBonuses();
        fighter.talk();

        Character sorcerer = new Character("Bard", ClassFactory.getClass("Bard"));
        sorcerer.talk();

        sorcerer.addClassBonuses();
        sorcerer.talk();
    }
}