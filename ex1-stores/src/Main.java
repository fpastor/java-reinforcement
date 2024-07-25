/*
 Java Reinforcement
 EXERCISE 1 + 2
 Fernando Pastor
 22.07.2024
 */

public class Main {
    public static void main(String[] args) {
        // Store store = new Store(); <-- Como es una clase abstracta no se puede instanciar!
        LiquorStore liquorStore = new LiquorStore(8.95, 20);
        liquorStore.welcome();

        liquorStore.payDrinks(10);
        double liquorCashValue = liquorStore.getCash();
        String liquorCashResult = String.format("%.2f", liquorCashValue);
        System.out.println("LIQUOR CASH VALUE: " + liquorCashResult + " €.");

        Store anonymousStore = new Store(8.95) {
            @Override
            public void welcome() {
                String drinkPriceValue = String.format("%.2f", drinkPrice);
                System.out.println();
                System.out.println("Welcome to anonymous store! Our drink price is " + drinkPriceValue);
                System.out.println("---------------------------------------------------");
            }
        };
        anonymousStore.welcome();
        anonymousStore.payDrinks(10);

        double anonymousCashValue = anonymousStore.getCash();
        String anonymousCashResult = String.format("%.2f", anonymousCashValue);
        System.out.println("ANONYMOUS CASH VALUE: " + anonymousCashResult + " €.");
    }
}
