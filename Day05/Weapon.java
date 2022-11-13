public abstract class Weapon {
    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;
    protected boolean isEquiped;

    protected Weapon(String name, int apcost, int damage, boolean melee) {
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }

    public String getName() {
        return name;
    }

    public int getApcost() {
        return apcost;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isMelee() {
        return melee;
    }

    public boolean getIsEquiped() {
        return isEquiped;
    }

    public void setIsEquiped(boolean isEquiped) {
        this.isEquiped = isEquiped;
    }

    public abstract void attack();
}