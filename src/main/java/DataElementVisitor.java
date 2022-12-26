import java.util.LinkedHashMap;

public interface DataElementVisitor {
    LinkedHashMap<String, Object> visit(Stats stats);
    LinkedHashMap<String, Object> visit(Character character);
    LinkedHashMap<String, Object> visit(CharacterRace characterRace);
    LinkedHashMap<String, Object> visit(CharacterClass characterClass);
}
