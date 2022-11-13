package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public Toy create (String toyName) throws NoSuchToyException {
        if (toyName.equals("gameboy")) {
            return new Gameboy();
        } else if (toyName.equals("teddy")) {
            return new TeddyBear();
        } else {
            throw new NoSuchToyException("No such toy: " + toyName + ".");
        }
    }

    public List<GiftPaper> getPapers(int nbPapers) {
        List<GiftPaper> papers = new ArrayList<>();
        for (int i = 0; i < nbPapers; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }
}
