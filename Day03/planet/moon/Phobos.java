package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public planet.Mars getMars() {
        return this.mars;
    }

    public String getLandingSite() {
        return this.landingSite;
    }

    public Phobos(Object mars, String landingsite) {
        if (mars.getClass().getName()=="planet.Mars") {
            this.mars = (planet.Mars) mars;
            this.landingSite = landingsite;
            System.out.println("Phobos placed in orbit.");
        } else {
            System.out.println("No planet given.");
        }
    }
}