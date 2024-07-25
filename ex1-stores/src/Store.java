/*
 Store.java
 Fernando Pastor
 22.07.2024
 */

public abstract class Store {
    double cash;
    double drinkPrice;

    Store (double drinkPrice) {
        cash = 0f;
        this.drinkPrice = drinkPrice;
    }

    public abstract void welcome();

    public double getCash() {
        return cash;
    }

    public void payDrinks(int numOfDrinks) {
        cash += numOfDrinks * drinkPrice;
    }
}
