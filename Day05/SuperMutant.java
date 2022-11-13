public class SuperMutant extends Monster {
    protected static int id = 1;

    public SuperMutant() {
        super("SuperMutant #"+id, 170, 20);
        id++;
        setApCost(20);
        setDamage(60);
        System.out.println(getName()+": Roaarrr!");
    }    

    @Override
    public void recoverAP() {
        super.recoverAP();
        setHp(getHp()+10);
        if (getHp()>170) {
            setHp(170);
        }
    }

}
