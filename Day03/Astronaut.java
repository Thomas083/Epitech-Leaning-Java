class Astronaut {
    private String name;
    private int snacks = 0;
    private String destination = null;
    private int id;
    private static int instance = 0;
    
    public Astronaut(String Name) {
        this.name = Name;
        System.out.println(name + " ready for launch!");
        id = instance;
        instance++;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public int getSnacks() {
        return this.snacks;
    }

    public String getDestination() {
        return this.destination;
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
        if (this.destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }
    public void doActions(planet.Mars mars) {
                System.out.println(this.name + ": Started a mission!");
                this.destination = mars.getLandingSite();
        }
    public void doActions(chocolate.Mars mars) {
        System.out.println(this.name + ": Thanks for this mars number " + mars.getId());
        this.snacks++;
        if (this.destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }

    public void doActions(planet.moon.Phobos phobos) {
        System.out.println(this.name + ": Started a mission!");
        this.destination = phobos.getLandingSite();
    }

}