public class GreatWhite extends Shark {
    public GreatWhite(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        return (animal != this) && !(animal instanceof Canary);
    }

    @Override
    public void eat(Animal animal) {
        if(animal instanceof Canary) {
            System.out.println(getName()+": Next time you try to give me that to eat, I'll eat you instead.");
        } else {
            if(canEat(animal)) {
                System.out.println(getName()+" ate a "+animal.getType()+" named "+animal.getName()+".");
                if(animal instanceof Shark) {
                    System.out.println(getName()+": The best meal one could wish for.");
                }
                smellBlood(false);
            } else {
                System.out.println(getName()+": It's not worth my time.");
            }
        }
    }
}
