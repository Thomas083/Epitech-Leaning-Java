public class Warrior extends Character {
    
    public Warrior(String name) {
        super(name,"Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(name+": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        switch(weapon) {
            case "":
                throw new WeaponException(getName()+": I refuse to fight with my bare hands.");
            case "hammer", "sword":
                super.attack(weapon);
                System.out.println(getName()+": I'll crush you with my "+weapon+"!");
                break;
            default:
                throw new WeaponException(getName()+": A "+weapon+"?? What should I do with this?!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(getName()+": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName()+": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(getName()+": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(getName()+": moves back like a bad boy.");
    }
}
