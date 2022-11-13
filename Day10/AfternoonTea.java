public class AfternoonTea<D extends Drink, U extends Dessert> extends Menu<D, U> {
    public AfternoonTea(D drink, U dessert) {
        super(drink, dessert);
    }

    @Override
    public float getPrice() {
        float price = 0;
        price += getDrink().getPrice();
        price += getMeal().getPrice();
        return price * 0.9f;
    }

    @Override
    public int getCalories() {
        int calories = 0;
        calories += getDrink().getCalories();
        calories += getMeal().getCalories();
        return calories;
    }
}