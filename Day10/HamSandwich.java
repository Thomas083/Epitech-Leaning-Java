public class HamSandwich extends Sandwich {
    public HamSandwich() {
        super(4.00f, 230);
        this.vegetarian = false;
        this.ingredients.add("tomato");
        this.ingredients.add("salad");
        this.ingredients.add("cheese");
        this.ingredients.add("ham");
        this.ingredients.add("butter");
    }
}
