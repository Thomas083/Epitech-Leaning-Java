package chocolate;

public class Mars {
    private int id;
    private static int instance;
    
    public int getId() {
        return id;
    }

    public Mars() {
        id = instance;
        instance++;
    }
}