public abstract class Character implements Movable, Comparable<Character> {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;
    protected int capacity = 0;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public String getName() {
        return this.name;
    }

    public int getLife() {
        return this.life;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getWit() {
        return this.wit;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public int compareTo(Character other) {
        if (!this.equals(other)) {
            if (this.getRPGClass() == other.getRPGClass()) {
                return this.getCapacity() - other.getCapacity();
            }
            if (this instanceof Mage || other instanceof Mage) {
                if (this.getCapacity() % other.getCapacity() == 0 || other.getCapacity() % this.getCapacity() == 0) {
                    return this.getCapacity() - other.getCapacity();
                } else {
                    return other.getCapacity() - this.getCapacity();
                }
            }
        }
        return 0;
    }

    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(this.name + ": unsheathes his weapon.");
    }
}