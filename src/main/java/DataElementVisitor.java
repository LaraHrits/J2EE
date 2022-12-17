public interface DataElementVisitor {
    void visit(Stats stats);
    void visit(Character character);
    void visit(CharacterRace characterRace);
    void visit(CharacterClass characterClass);
}