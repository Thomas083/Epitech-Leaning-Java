package planet;

public class Mars {
    private int id;
    private static int instance;
    private String landingSite;
    
    public int getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public Mars(String landingsite) {
        id = instance;
        instance++;
        landingSite = landingsite;
    }
}