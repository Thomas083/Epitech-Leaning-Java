public interface Fighter{

    public boolean equip(Weapon weapon);
    public boolean attack(Fighter target);
    public void receiveDamage(int damage);
    public boolean moveCloseTo(Fighter target);
    public void recoverAP();
    public String getName();
    public int getAp();
    public int getHp();
}
