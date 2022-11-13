public class AssaultTerminator extends SpaceMarine {
    public AssaultTerminator(String name) {
        super(name,150,30);
        System.out.println(getName()+" has teleported from space.");
        equip(new PowerFist());
    }
    
    @Override
    public void receiveDamage(int damage) {
        if (damage - 3 < 1){
            super.receiveDamage(1);
        } else {
            super.receiveDamage(damage - 3);
        }
    }
}