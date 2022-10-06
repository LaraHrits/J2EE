import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> item_item = new ArrayList<Item>();

    public void addItem(Item item) {
        item_item.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : item_item) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : item_item) {
            System.out.print("Your choice is: " + item.name() + " in " + item.packing().packing_choice() + " packing, ");
            System.out.print("that cost: " + item.price() + "$\n");
        }
    }
}
