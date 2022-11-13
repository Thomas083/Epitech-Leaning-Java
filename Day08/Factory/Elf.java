package Factory;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    private Toy toy;
    private List<GiftPaper> papers = new ArrayList<>();
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String toyName) {
        if (toy == null) {
            try {
                toy = factory.create(toyName);
                System.out.println("What a nice one! I would have liked to keep it...");
                return true;
            } catch (NoSuchToyException e) {
                System.out.println("I didn't find any " + toyName + ".");
                return false;
            }
        } else {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }
    }

    public boolean pickPapers(int nbPapers) {
        this.papers.addAll(factory.getPapers(nbPapers));        
        return true;
    }

    public GiftPaper pack() {
        if (papers == null || papers.isEmpty()) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        GiftPaper paper = this.papers.get(this.papers.size() - 1);
        if (this.toy == null) {
            System.out.println("I don't have any toy, but hey at least it's paper!");
            return paper;
        }
        paper.wrap(toy);
        this.papers.remove(paper);
        toy = null;
        System.out.println("And another kid will be happy!");
        return paper;

    }
}
