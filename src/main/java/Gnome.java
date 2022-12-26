import java.util.Map;

public class Gnome extends CharacterRace {

    public Gnome() {
        this.race = "Gnome";
        this.bonuses = new Stats(0, 1, 0, 2, 0, 0);
    }

    @Override
    public void accept(DataElementVisitor visitor, Map<String, Object> map) {
        map.putAll(visitor.visit(this));
    }

    @Override
    public void saySMTH() {
        System.out.println("I'm Gnome and I want to sleep");
    }
}
