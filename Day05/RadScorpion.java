public class RadScorpion extends Monster{
    protected static int id = 1;
    public RadScorpion() {
        super("RadScorpion #"+id, 80, 50);
        id++;
        System.out.println(getName()+": Crrr!");
        setApCost(8);
        setDamage(25);
    }
    
    @Override
    public boolean attack(Fighter target) {    
        if (super.attack(target) && target instanceof TacticalMarine) {
            target.receiveDamage(getDamage());
            return true;
        }
        return false;
        }
    }

