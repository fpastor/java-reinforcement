/*
 LiquorStore.java
 Fernando Pastor
 22.07.2024
 */

public class LiquorStore extends Store {
    private final int tax;

    LiquorStore(double drinkPrice, int tax) {
        super(drinkPrice);
        this.tax = tax;
    }

    @Override
    public void welcome() {
        System.out.println();
        System.out.println("Welcome to our liquor store. If you are younger than 18, go back home!");
        System.out.println("----------------------------------------------------------------------");
    }

    @Override
    public void payDrinks(int numOfDrinks) {
        super.payDrinks(numOfDrinks);
        cash += (numOfDrinks * drinkPrice * tax) / 100;
    }
}
