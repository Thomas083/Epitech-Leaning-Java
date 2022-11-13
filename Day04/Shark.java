public class Shark extends Animal {
    private boolean frenzy;

    public Shark(String name) {
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
        this.frenzy = false;
    }

    public void smellBlood(boolean blood) {
        this.frenzy = blood;
    }
    
    public void status() {
        if (this.frenzy) {
            System.out.println(getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {
        return animal != this;
    }

    public void eat(Animal animal) {
        if(canEat(animal)) {
            System.out.println(getName()+" ate a "+animal.getType()+" named "+animal.getName()+".");
            smellBlood(false);
        } else {
            System.out.println(getName()+": It's not worth my time.");
        }
    }

    public static void main(String[] args) {
        Shark willy = new Shark("Willy"); // Yes Willy is a shark here !
        willy.status();
        willy.smellBlood(true);
        willy.status();
    }
}
