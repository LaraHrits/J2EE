public class Demo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory = new GnomeFactory();

        Character character = new Character("Piter", raceAbstractFactory.create());
        character.addRaceBonuses();
        character.talk();

        raceAbstractFactory = new HalfOrcFactory();

        character = new Character("Boris", raceAbstractFactory.create());
        character.addRaceBonuses();
        character.talk();
    }
}