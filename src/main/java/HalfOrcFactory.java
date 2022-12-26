public class HalfOrcFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new HalfOrc();
    }
}
