public class Breakfast<D extends Drink, U extends Bread> extends Menu<D, U> {
    public Breakfast(D drink, U bread) {
        super(drink, bread);
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