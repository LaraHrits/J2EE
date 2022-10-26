public class HalfOrc extends CharacterRace {
    public HalfOrc() {
        name = "Half-Orc - Piter";
        bonuses = new Stats(2, 0, 1, 0, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("I'm Half-Orc Piter and I'm ready for new game");
    }
}