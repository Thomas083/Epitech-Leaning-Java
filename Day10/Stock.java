import java.util.Map;
import java.util.HashMap;

public class Stock {
    private Map<Class<? extends Food>, Integer> stock;

    public Stock() {
        this.stock = new HashMap<Class<? extends Food>, Integer>();
        this.stock.put(AppleSmoothie.class, 100);
        this.stock.put(CheeseCake.class, 100);
        this.stock.put(Coke.class, 100);
        this.stock.put(Cookie.class, 100);
        this.stock.put(FrenchBaguette.class, 100);
        this.stock.put(HamSandwich.class, 100);
        this.stock.put(Panini.class, 100);
        this.stock.put(SoftBread.class, 100);
    }

    public int getNumberOf(Class<? extends Food> food) throws NoSuchFoodException {
        if (stock.containsKey(food)) {
            return stock.get(food);
        }
        throw new NoSuchFoodException("No such food type: " + food.getName() + ".");
    }

    public boolean add(Class<? extends Food> food) throws NoSuchFoodException {
        if (stock.containsKey(food)) {
            stock.replace(food, getNumberOf(food), getNumberOf(food) + 1);
            return true;
        }
        throw new NoSuchFoodException("No such food type: " + food.getName() + ".");
    }

    public boolean remove(Class<? extends Food> food) throws NoSuchFoodException {
        if (stock.containsKey(food)) {
            if (getNumberOf(food) <= 0) {
                return false;
            }
            stock.replace(food, getNumberOf(food), getNumberOf(food) - 1);
            return true;
        }
        throw new NoSuchFoodException("No such food type: " + food.getName() + ".");
    }
}
