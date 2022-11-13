import java.util.List;
import java.util.ArrayList;

public class SpaceArena {
    protected List<Monster> monsters;
    protected List<SpaceMarine> spaceMarines;

    public SpaceArena() {
        this.monsters = new ArrayList<Monster>();
        this.spaceMarines = new ArrayList<SpaceMarine>();
    }

    public void enlistMonsters(List<Monster> monsters) {
        for (Monster monster : monsters) {
            if (!this.monsters.contains(monster)) {
                this.monsters.add(monster);
            }
        }
    }

    public void enlistSpaceMarines(List<SpaceMarine> spaceMarines) {
        for (SpaceMarine spaceMarine : spaceMarines) {
            if (!this.spaceMarines.contains(spaceMarine)) {
                this.spaceMarines.add(spaceMarine);
            }
        }
    }

    public boolean fight() {
        if (this.monsters.isEmpty() && this.spaceMarines.isEmpty()) {
            return false;
        }
        if (this.monsters.isEmpty()) {
            System.out.println("No monsters available to fight.");
            return false;
        }
        if (this.spaceMarines.isEmpty()) {
            System.out.println("Those cowards ran away.");
            return false;
        }
        while (!this.monsters.isEmpty() && !this.spaceMarines.isEmpty()) {
            if (!spaceMarines.get(0).getIsEntered()) {
                System.out.println(spaceMarines.get(0).getName() + " has entered the arena.");
                spaceMarines.get(0).setIsEntered(true);
            }
            if (!monsters.get(0).getIsEntered()) {
                System.out.println(monsters.get(0).getName() + " has entered the arena.");
                monsters.get(0).setIsEntered(true);
            }
            while (spaceMarines.get(0).getHp() > 0 && monsters.get(0).getHp() > 0) {
                // System.out.println(spaceMarines.get(0).getName() + " has " + spaceMarines.get(0).getHp() + " left and has " + spaceMarines.get(0).getAp() + " Ap left.");
                // System.out.println(monsters.get(0).getName() + " has " + monsters.get(0).getHp() + " left and has " + monsters.get(0).getAp() + " Ap left");
                if (!spaceMarines.get(0).attack(monsters.get(0))){
                    if (spaceMarines.get(0).getAp() <= spaceMarines.get(0).getWeapon().getApcost()) {
                        spaceMarines.get(0).recoverAP();
                    }
                }
                if (!monsters.get(0).attack(spaceMarines.get(0))){
                    if (monsters.get(0).getAp() <= monsters.get(0).getApcost()) {
                        monsters.get(0).recoverAP();
                    }
                }
            }
            if (spaceMarines.get(0).getHp() <= 0) {
                spaceMarines.remove(0);
                monsters.get(0).recoverAP();
                monsters.get(0).setInRangeBool(false);
                if (spaceMarines.size() != 0) {
                    System.out.println(spaceMarines.get(0).getName() + " has entered the arena.");
                    spaceMarines.get(0).setIsEntered(true);
                }
            }
            if (monsters.get(0).getHp() <= 0) {
                monsters.remove(0);
                spaceMarines.get(0).recoverAP();
                spaceMarines.get(0).setInRangeBool(false);
                if (monsters.size() != 0) {
                    System.out.println(monsters.get(0).getName() + " has entered the arena.");
                    monsters.get(0).setIsEntered(true);
                }
            }
        }
        if (this.monsters.isEmpty()) {
            System.out.println("The spaceMarines are victorious.");
            return true;
        } else {
            System.out.println("The monsters are victorious.");
            return false;
        }
    }
}
