public abstract class Menu<T extends Food,U extends Food> implements Food {
    protected T drink;
    protected U meal;

    public Menu(T drink, U meal) {
        this.drink = drink;
        this.meal = meal;
    }

    public T getDrink() {
        return this.drink;
    }

    public U getMeal() {
        return this.meal;
    }

    @Override
    public float getPrice() {
        float price = 0;
        price += getDrink().getPrice();
        price += getMeal().getPrice();
        return Math.round(price * 0.9f * 100.0f) / 100.0f;
    }
}