public class Gecko {
    private String name;
    private int age;

    public int setAge(int age) {
        this.age = age;
        return this.age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String Name) {
        this.name = Name;
        System.out.println("Hello " + this.name + "!");
    }
    
    public Gecko(String Name, int age) {
        this.name = Name;
        this.age = age;
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
}