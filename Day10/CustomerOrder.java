import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private Stock stock;
    private List<Food> foods = new ArrayList<Food>();
    private List<Menu<? extends Drink, ? extends Food>> menus = new ArrayList<Menu<? extends Drink, ? extends Food>>();

    public CustomerOrder(Stock stock) {
        this.stock = stock;
    }

    public boolean addItem(Food food) throws NoSuchFoodException {
        if (this.stock.getNumberOf(food.getClass()) > 0) {
            this.foods.add(food);
            this.stock.remove(food.getClass());
            return true;
        }
        return false;
    }

    public boolean removeItem(Food food) throws NoSuchFoodException {
        if (this.foods.contains(food)) {
            this.foods.remove(food);
            this.stock.add(food.getClass());
            return true;
        }
        return false;
    }

    public float getPrice() {
        float price = 0;
        for (Food food : this.foods) {
            price += food.getPrice();
        }
        for (Menu<? extends Drink, ? extends Food> menu : this.menus) {
            price += menu.getPrice();
            
        }
        return Math.round(price * 100.0f) / 100.0f;
    }

    public boolean addMenu(Menu<? extends Drink, ? extends Food> menu) throws NoSuchFoodException {
        if (this.stock.getNumberOf(menu.getDrink().getClass()) > 0 && this.stock.getNumberOf(menu.getMeal().getClass()) > 0) {
            this.menus.add(menu);
            this.stock.remove(menu.getDrink().getClass());
            this.stock.remove(menu.getMeal().getClass());
            return true;
        }
        return false;
    }

    public boolean removeMenu(Menu<? extends Drink, ? extends Food> menu) throws NoSuchFoodException {
        if (this.menus.contains(menu)) {
            this.menus.remove(menu);
            this.stock.add(menu.getDrink().getClass());
            this.stock.add(menu.getMeal().getClass());
            return true;
        }
        return false;
    }

    public void printOrder() {
        System.out.println("Your order is composed of:");
        for (Menu<? extends Drink, ? extends Food> menu : menus) {
            System.out.println("- " + menu.getClass().getName() + " menu (" + Math.round(menu.getPrice() * 100.0f) / 100.0f + " euros)");
            System.out.println("-> drink: " + menu.getDrink().getClass().getName());
            System.out.println("-> meal: " + menu.getMeal().getClass().getName());
        }
        for (Food food : foods) {
            System.out.println("- " + food.getClass().getName() + " (" + food.getPrice() + " euros)");
        }
        System.out.println("For a total of " + this.getPrice() + " euros.");
    }
}
