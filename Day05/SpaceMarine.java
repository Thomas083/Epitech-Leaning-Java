public abstract class SpaceMarine extends Unit {
    protected Weapon weapon;
    protected boolean isEntered = false;

    public boolean getIsEntered() {
        return isEntered;
    }

    public void setIsEntered(boolean isEntered) {
        this.isEntered = isEntered;
    }

    public SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public boolean equip(Weapon weapon) {
        if (weapon.getIsEquiped()) {
            return false;
        }
        if (this.getHp() > 0) {
            if (weapon != null) {
                this.weapon = weapon;
                System.out.println(getName() + " has been equipped with a " + weapon.getName() + ".");
                weapon.setIsEquiped(true);
                return true;
            }
        }
        return false;
    }

    public boolean attack(Fighter target) {
        if (this.getHp() < 0) {
            return false;
        }
        if (this.weapon==null) {
            System.out.println(getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
        }
        if (getWeapon().isMelee() && !getInRangeBool()) {
            System.out.println(getName() + ": I'm too far away from " + target.getName() + ".");
            moveCloseTo(target);
            return true;
        }
        if (getAp() >= getWeapon().getApcost()) {
            System.out.println(getName() + " attacks " + target.getName() + " with a " + getWeapon().getName() + ".");
            target.receiveDamage(getWeapon().getDamage());
            weapon.attack();
            setAp(getAp() - getWeapon().getApcost());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void recoverAP() {
        setAp(getAp() + 9);
        if (getAp() > 50) {
            setAp(50);
        }
    }

}
