import java.util.ArrayList;
import java.util.List;

public class Bard extends CharacterClass {
    private final List<String> spells;

    public Bard() {
        this.name = "Bard";
        this.hp = 8;
        this.spells = new ArrayList<>(List.of(new String[]{"Charm Person", "Heroism"}));
    }

    @Override
    public void printMagica() {
        System.out.print("Character " + name + " with ability ");

        for (String spell : spells) {
            System.out.print(spell);

            if (!spell.equals(spells.get(spells.size() - 1))) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}