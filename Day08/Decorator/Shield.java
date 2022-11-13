package Decorator;

public class Shield extends StuffDecorator{
    private Warrior holder;

    public Shield(Warrior holder) {
        super(holder);
        this.holder = holder;
        System.out.println("May this shield protect me against every enemy.");
    }
    
    @Override
    public int getHp() {
        return holder.getHp() + 10;
    }
}
