import java.util.ArrayList;

public class Model {
    private final GnomeFactory gnomeFactory = new GnomeFactory();
    private final HalfOrcFactory halfOrcFactory = new HalfOrcFactory();

    private Character bufferCharacter;
    private Stats bufferStats;
    private final ArrayList<Character> characters = new ArrayList<>();

    private CareTaker careTaker = new CareTaker();
    private final DataElementVisitor visitor = new ElementVisitor();

    public void presaveCharacter(Character character){
        this.bufferCharacter = character;
    }
    public Character getBufferCharacter(){
        return bufferCharacter;
    }

    public void setCareTaker(CareTaker careTaker){
        this.careTaker = careTaker;
    }
    public CareTaker getCareTaker() {
        return careTaker;}

    public Stats getBufferStats(){
        return bufferStats;
    }
    public void setBufferStats(Stats bufferStats){
        this.bufferStats = new Stats(bufferStats);
    }

    public DataElementVisitor getVisitor() {
        return visitor;
    }

    public ArrayList<Character> getCharacters(){
        return characters;
    }

    public void saveCharacter(){
        characters.add(bufferCharacter);
        bufferCharacter = null;
        bufferStats = null;
    }

    public RaceAbstractFactory getRaceFactory(String race){
        switch (race){
            case ("Gnome") -> {
                return gnomeFactory;
            }
            case ("Half-Orc") -> {
                return halfOrcFactory;
            }
            default -> {
                System.err.println("Error race");
                return null;
            }
        }
    }

}
