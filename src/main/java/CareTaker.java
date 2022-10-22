import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Stats> mementoList = new ArrayList<>();

    static int ID = 0;

    public void add(Stats state) {
        mementoList.add(state);

        System.out.println("ID - " + ID);

        ID++;
    }

    public Stats get(int index) {
        System.out.println("\nOpen stats with ID - " + index);

        return mementoList.get(index);
    }
}
