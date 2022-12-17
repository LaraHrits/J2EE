import java.util.TreeMap;

public class ElementVisitor implements DataElementVisitor {
    @Override
    public TreeMap<String, String> visit(Stats stats) {
        TreeMap<String, String>  res = new TreeMap<>();
        for(String key: stats.getStats().keySet()){
            res.put(key, stats.getStats().get(key).toString());
        }
        return res;
    }

    @Override
    public TreeMap<String, String> visit(Character character) {
        TreeMap<String, String>  res = new TreeMap<>();
        res.put("Name", character.getName());
        return res;
    }

    @Override
    public TreeMap<String, String> visit(CharacterRace characterRace) {
        TreeMap<String, String>  res = new TreeMap<>();
        res.put("Race", characterRace.getRace());
        return res;
    }

    @Override
    public TreeMap<String, String> visit(CharacterClass characterClass) {
        TreeMap<String, String>  res = new TreeMap<>();
        res.put("Class", characterClass.getType());
        return res;
    }
}