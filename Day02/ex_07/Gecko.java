public class Gecko {
    private String name;
    private int age;
    private int energy = 100;

    public int setAge(int age) {
        this.age = age;
        return this.age;
    }

    public int setEnergy(int energy) {
        this.energy = energy;
        if (this.energy > 100) {
            this.energy = 100;
        }
        if (this.energy < 0) {
            this.energy = 0;
        }
        return this.energy;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public int getEnergy() {
        return this.energy;
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String Name) {
        this.name = Name;
        System.out.println("Hello " + this.name + "!");
    }

    public void status() {
        switch (age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1, 2:
                System.out.println("Baby Gecko");
                break;
            case 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("Adult Gecko");
                break;
            case 11, 12, 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String str) {
        System.out.println("Hello " + str + ", I'm " + getName() + "!");
    }

    public void hello(int nombre) {
        for (int i = 0; i < nombre; i++) {
            System.out.println("Hello, I'm " + getName() + "!");
        }
    }

    public void eat(String str) {
        switch (str.toLowerCase()) {
            case "meat":
                System.out.println("Yummy!");
                setEnergy(this.energy += 10);
                break;
            case "vegetable":
                System.out.println("Erk!");
                setEnergy(this.energy -= 10);
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            this.energy -= 9;
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(getEnergy()+50);
        }
    }
}