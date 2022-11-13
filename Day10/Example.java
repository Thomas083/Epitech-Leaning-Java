public class Example {
    public static void main(String[] args) throws NoSuchFoodException {
        // ex_01();
        ex_02();
        // ex_03();
        // ex_03bis();
    }

    public static void ex_01() {
        SoftBread bread = new SoftBread();
        System.out.println("The softbread costs " + bread.getPrice() + " euros and contains " + bread.getCalories() + " calories." + " bakingTime " + bread.getBakingTime());
        System.out.println("\n");

        FrenchBaguette frenchBaguette = new FrenchBaguette();
        System.out.println("The french baguette costs " + frenchBaguette.getPrice() + " euros and contains " + frenchBaguette.getCalories() + " calories." + " bakingTime " + frenchBaguette.getBakingTime());
        System.out.println("\n");

        AppleSmoothie appleSmoothie = new AppleSmoothie();
        System.out.println("The apple smoothie costs " + appleSmoothie.getPrice() + " euros and contains " + appleSmoothie.getCalories() + " calories." + (appleSmoothie.isACan() ? " is a can" : " is not a can"));
        System.out.println("\n");

        Coke coke = new Coke();
        System.out.println("The coke costs " + coke.getPrice() + " euros and contains " + coke.getCalories() + " calories." + (coke.isACan() ? " is a can" : " is not a can"));
        System.out.println("\n");

        HamSandwich hamSandwich = new HamSandwich();
        System.out.println("The ham sandwich costs " + hamSandwich.getPrice() + " euros and contains " + hamSandwich.getCalories() + " calories." + (hamSandwich.isVegetarian() ? " is veggie" : " is not veggie"));
        hamSandwich.getIngredients().forEach(System.out::println);
        System.out.println("\n");

        Panini panini = new Panini();
        System.out.println("The panini costs " + panini.getPrice() + " euros and contains " + panini.getCalories() + " calories." + (panini.isVegetarian() ? " is veggie" : " is not veggie"));
        panini.getIngredients().forEach(System.out::println);
        System.out.println("\n");


        Cookie cookie = new Cookie();
        System.out.println("The cookie costs " + cookie.getPrice() + " euros and contains " + cookie.getCalories() + " calories.");
        System.out.println("\n");

        CheeseCake cheeseCake = new CheeseCake();
        System.out.println("The cheese cake costs " + cheeseCake.getPrice() + " euros and contains " + cheeseCake.getCalories() + " calories.");
    }


    public static void ex_02() {
        Drink drinkBreakfast = new AppleSmoothie();
        FrenchBaguette mealBreakfast = new FrenchBaguette();
        Breakfast breakfast = new Breakfast(drinkBreakfast, mealBreakfast);
        System.out.println("The breakfast  costs " + breakfast.getPrice() + " euros and contains :\n" + "meal: " + breakfast.meal.getClass().getName() + "\ndrink: " + breakfast.drink.getClass().getName());
        System.out.println("\n");

        Drink drinkLunch = new AppleSmoothie();
        Panini mealLunch = new Panini();
        Lunch lunch = new Lunch(drinkLunch, mealLunch);
        System.out.println("The lunch costs " + lunch.getPrice() + " euros and contains :\n" + "meal: " + lunch.meal.getClass().getName() + "\ndrink: " + lunch.drink.getClass().getName());
        System.out.println("\n");

        Drink drinkAfternoonTea = new Coke();
        Dessert mealAfternoonTea = new Cookie();
        AfternoonTea afternoonTea = new AfternoonTea(drinkAfternoonTea, mealAfternoonTea);
        System.out.println("The afternoon tea costs " + afternoonTea.getPrice() + " euros and contains :\n" + "meal: " + afternoonTea.meal.getClass().getName() + "\ndrink: " + afternoonTea.drink.getClass().getName());
        System.out.println("\n");

    }

    public static void ex_03() throws NoSuchFoodException {
        System.out.println("--------------");
        Breakfast<AppleSmoothie, SoftBread> breakfast = new Breakfast<>(new AppleSmoothie
                (), new SoftBread());

        Breakfast<Coke, FrenchBaguette> breakfast2 = new Breakfast<>(new Coke()
                , new FrenchBaguette());

        Food cookie = new Cookie();
        Food cheeseCake = new CheeseCake();
        Stock stock = new Stock();
        CustomerOrder order = new CustomerOrder(stock);

        System.out.println("cookie stock: "+stock.getNumberOf(cookie.getClass()));
        System.out.println("add cookies");
        order.addItem(cookie);
        System.out.println("cookie stock: "+stock.getNumberOf(cookie.getClass()));
        System.out.println("\n");

        System.out.println("cheese cake stock: "+stock.getNumberOf(cheeseCake.getClass()));
        System.out.println("add cheese cake");
        order.addItem(cheeseCake);
        System.out.println("cheese cake stock: "+stock.getNumberOf(cheeseCake.getClass()));
        System.out.println("\n");

        System.out.println("cheese cake stock: "+stock.getNumberOf(cheeseCake.getClass()));
        System.out.println("remove cheese cake");
        order.removeItem(cheeseCake);
        System.out.println("cheese cake stock: "+stock.getNumberOf(cheeseCake.getClass()));
        System.out.println("\n");



        System.out.println("apple smoothie stock: "+stock.getNumberOf(AppleSmoothie.class));
        System.out.println("soft bread stock: "+stock.getNumberOf(SoftBread.class));
        System.out.println("add breakfast");
        order.addMenu(breakfast);
        System.out.println("apple smoothie stock: "+stock.getNumberOf(AppleSmoothie.class));
        System.out.println("soft bread stock: "+stock.getNumberOf(SoftBread.class));
        System.out.println("\n");


        System.out.println("coke stock: "+stock.getNumberOf(Coke.class));
        System.out.println("french baguette stock: "+stock.getNumberOf(FrenchBaguette.class));
        System.out.println("add breakfast2");
        order.addMenu(breakfast2);
        System.out.println("coke stock: "+stock.getNumberOf(Coke.class));
        System.out.println("french baguette stock: "+stock.getNumberOf(FrenchBaguette.class));
        System.out.println("\n");

        System.out.println("coke stock: "+stock.getNumberOf(Coke.class));
        System.out.println("french baguette stock: "+stock.getNumberOf(FrenchBaguette.class));
        System.out.println("remove breakfast2");
        order.removeMenu(breakfast2);
        System.out.println("coke stock: "+stock.getNumberOf(Coke.class));
        System.out.println("french baguette stock: "+stock.getNumberOf(FrenchBaguette.class));
        System.out.println("\n");

        order.printOrder();
    }

    public static void ex_03bis() throws NoSuchFoodException {
        Food cookie = new Cookie();
        Food cheeseCake = new CheeseCake();
        Stock stock = new Stock();
        try {
            for (int i = 1; i <= 200; i++) {
                stock.remove(cookie.getClass());
                System.out.println("turn " + i + " --- stock " + stock.getNumberOf(cookie.getClass()));
            }
        } catch (NoSuchFoodException e) {
            System.out.println("cookie stock "+stock.getNumberOf(cookie.getClass()));
            System.out.println(e.getMessage());
            for (int i = 1; i <= 20; i++) {
                stock.add(cookie.getClass());
                System.out.println("turn " + i + " --- stock " + stock.getNumberOf(cookie.getClass()));
            }
        }
    }

}