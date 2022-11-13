public class Gecko {
    private String name;
    
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
}