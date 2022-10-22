public class Character {
    private String name;
    private String dndClass;
    private String race;
    private Stats attributes;

    public Character(String name, String dndClass, String race) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public String getdndClass() {
        return dndClass;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void setDndclass(String dndClass) {
        this.dndClass = dndClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void printInfo() {
        System.out.println("Name: " + name +
                "\nClass: " + dndClass +
                "\nRace: " + race);
        attributes.printStats();
    }
}
