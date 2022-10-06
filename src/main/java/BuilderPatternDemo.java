public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("\nMenu #1 Non veg meal:");
        nonVegMeal.showItems();
        System.out.printf("The total cost of menu = %.2f$ ", nonVegMeal.getCost());

        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("\n");

        System.out.println("\nMenu #2 Veg meal");
        vegMeal.showItems();
        System.out.printf("The total cost of menu = %.2f$ ", vegMeal.getCost());

    }
}
