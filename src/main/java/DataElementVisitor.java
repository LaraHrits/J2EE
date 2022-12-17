import java.util.TreeMap;

public interface DataElementVisitor {
    TreeMap<String, String> visit(Stats stats);
    TreeMap<String, String> visit(Character character);
    TreeMap<String, String> visit(CharacterRace characterRace);
    TreeMap<String, String> visit(CharacterClass characterClass);
}