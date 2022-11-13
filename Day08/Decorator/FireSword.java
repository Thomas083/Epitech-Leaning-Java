package Decorator;

public class FireSword extends StuffDecorator {
    private Warrior holder;

    public FireSword(Warrior holder) {
        super(holder);
        this.holder = holder;
        System.out.println("I can slice and burn like the wind and the flames.");
    }
    
    public int getDmg() {
        return holder.getDmg() + 3;
    }
}
