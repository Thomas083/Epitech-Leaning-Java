public class TacticalMarine extends SpaceMarine {
    public TacticalMarine(String name) {
        super(name,100,20);
        System.out.println(getName()+" on duty.");
        equip(new PlasmaRifle());
    }
    
    @Override
    public void recoverAP() {
        setAp(getAp() + 12);
        if (getAp() > 50) {
            setAp(50);
        }
    }
}