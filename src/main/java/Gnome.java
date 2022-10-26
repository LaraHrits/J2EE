

public class Gnome extends CharacterRace {
    public Gnome(){
        this.name = "Gnome - Boris";
        this.bonuses = new Stats(0, 1, 0, 2, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("I'm Gnome Boris and I want to sleep");
    }
}