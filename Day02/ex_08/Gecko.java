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

    public void hello(Object str) {
        if (str instanceof String) {
            System.out.println("Hello " + str + ", I'm " + this.name + "!");
        } else if (str instanceof Integer) {
            int nbr = (int) str;
            for (int i = 0; i < nbr; i++) {
                System.out.println("Hello, I'm " + this.name + "!");
            }
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
            System.out.println("Heyyy I'm too sleepy, better take nap!");
            this.energy = 50;
        }
    }

    public void fraternize(Gecko gecko) {
        if (gecko.getEnergy() < 30 && this.getEnergy() < 30) {
            System.out.println("Not today!");
            System.out.println("Not today!");
        } else if (gecko.getEnergy() < 30) {
            System.out.println("Sorry " + this.getName() + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        } else if (this.getEnergy() < 30) {
            System.out.println("Sorry " + gecko.getName() + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        } else {
            gecko.setEnergy(gecko.getEnergy() - 30);
            this.setEnergy(this.getEnergy() - 30);
            System.out.println("I'm going to dring with " + gecko.getName() + "!");
            System.out.println("I'm going to dring with " + this.getName() + "!");
        }
    }

    public void fraternize(Snake snake) {
        if (this.getEnergy() >= 10) {
            this.setEnergy(0);
            System.out.println("LET'S RUN AWAY!!!");
        }
        // else play dead
        else {
            System.out.println("...");
        }
    }
}