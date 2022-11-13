public class Lunch<D extends Drink, U extends Sandwich> extends Menu<D, U> {
    public Lunch(D drink, U meal) {
        super(drink, meal);
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