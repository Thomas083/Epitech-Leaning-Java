public class Animal {
    protected enum Type {
        MAMMAL, FISH, BIRD
    };

    private String name;
    private int legs;
    private Type type;

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        numberOfAnimals++;
        if(type == Type.MAMMAL) {
            numberOfMammals++;
        } else if(type == Type.FISH) {
            numberOfFish++;
        } else if(type == Type.BIRD){
            numberOfBirds++;
        }
        System.out.println("My name is " + this.name + " and I am a " + getType() + "!");
    }

    public String getName() {
        return this.name;
    }

    public int getLegs() {
        return this.legs;
    }

    public String getType() {
        switch (type) {
            case MAMMAL:
                return "mammal";
            case FISH:
                return "fish";
            default:
                return "bird";
        }
    }

    public static int getNumberOfAnimals() {
        if(numberOfAnimals == 1) {
            System.out.println("There is currently "+numberOfAnimals+" animal in our world.");
        } else {
            System.out.println("There are currently "+numberOfAnimals+" animals in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if(numberOfMammals == 1) {
            System.out.println("There is currently "+numberOfMammals+" mammal in our world.");
        } else {
            System.out.println("There are currently "+numberOfMammals+" mammals in our world.");
        }
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if(numberOfFish == 1) {
            System.out.println("There is currently "+numberOfFish+" fish in our world.");
        } else {
            System.out.println("There are currently "+numberOfFish+" fish in our world.");
        }
        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        if(numberOfBirds == 1) {
            System.out.println("There is currently "+numberOfBirds+" bird in our world.");
        } else {
            System.out.println("There are currently "+numberOfBirds+" birds in our world.");
        }
        return numberOfBirds;
    }

    public static void main(String[] args) {
        Animal isidore = new Animal("Isidore", 4, Animal.Type.MAMMAL);
        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() + ".");
        Animal.getNumberOfAnimals();
        Animal cat = new Animal("Cat", 4, Animal.Type.MAMMAL);
        Animal.getNumberOfAnimals();
        Animal.getNumberOfMammals();
        Animal.getNumberOfBirds();
        Animal.getNumberOfFish();
    }
}