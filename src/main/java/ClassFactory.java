public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Bard" -> new Bard();
            default -> throw new IllegalArgumentException("This class type doesn't exist");
        };
    }
}
