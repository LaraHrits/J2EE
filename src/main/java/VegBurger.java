public class VegBurger extends Burger {
    @Override
    public float price() {
        return 15.25f;
    }

    @Override
    public String name() {
        return "\"Veg Burger\"";
    }
}