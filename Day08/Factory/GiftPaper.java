package Factory;

public class GiftPaper {
    private Toy gift;

    public void wrap(Toy toy) {
        gift = toy;
    }

    public Toy getGift() {
        return gift;
    }

    public Toy unwrap() {
        Toy newToy = this.gift;
        this.gift = null;
        return newToy;
    }
}
