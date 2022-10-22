import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    private static int roll() {
        Random random = new Random();

        return (int) Math.round(6 * random.nextDouble());
    }

    public static int rollStat() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(roll());
        }

        list.sort(Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += list.get(i);
        }

        return sum;
    }
}