import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Astronaut> astronauts;
    
    public Team(String TeamName) {
        this.name = TeamName;
        this.astronauts = new ArrayList<Astronaut>();
    }

    public String getName() {
        return name;
    }

    public void add(Astronaut astronaut) {
        this.astronauts.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        this.astronauts.remove(astronaut);
    }

    public int countMembers() {
        return this.astronauts.size();
    }

    public void showMembers() {
        int countMembers = 0;
        String members = getName() + ": ";
        if (astronauts.size() != 0) {
            for (Astronaut astronaut : this.astronauts) {
                countMembers += 1;
                if (astronaut.getDestination() == null) {
                    if (countMembers == astronauts.size()) {
                        members += astronaut.getName() + " on standby.";
                    } else {
                        members += astronaut.getName() + "on standby, ";
                    }
                } else {
                    if (countMembers == astronauts.size()) {
                        members += astronaut.getName() + " on mission.";
                    } else {
                        members += astronaut.getName() + " on mission, ";
                    }
                }
            }
        }
        System.out.println(members);
    }
    
    public void doActions() {
        System.out.println(getName()+": Nothing to do.");
    }

    public void doActions(planet.Mars mars) {
        for (Astronaut astronaut : this.astronauts) {
            astronaut.doActions(mars);
        }
    }

    public void doActions(chocolate.Mars mars) {
        for (Astronaut astronaut : this.astronauts) {
            astronaut.doActions(mars);
        }
    }

    public void doActions(planet.moon.Phobos phobos) {
        for (Astronaut astronaut : this.astronauts) {
            astronaut.doActions(phobos);
        }
    }
}