public class Gecko {
    public String name;

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String Name) {
        this.name = Name;
        System.out.println("Hello " + name + "!");
    }
}