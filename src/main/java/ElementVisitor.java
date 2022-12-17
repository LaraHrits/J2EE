public class ElementVisitor implements DataElementVisitor {
    @Override
    public void visit(Stats stats) {
        System.out.println("Stats: " + stats.getStats());
    }

    @Override
    public void visit(Character character) {
        System.out.println("Character name: " + character.getName());
    }

    @Override
    public void visit(CharacterRace characterRace) {
        System.out.println("Race: " + characterRace.getRace() + characterRace.getBonuses());
    }

    @Override
    public void visit(CharacterClass characterClass) {
        System.out.println("\nClass: " + characterClass.getType() + "\ninitial hp: " + characterClass.getHP());
    }
}