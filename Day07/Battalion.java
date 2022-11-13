import java.util.ArrayList;
import java.util.List;

public class Battalion<T> {
    protected List<Character> characters = new ArrayList<Character>();

    public void add(List<Character> character) {
        this.characters.addAll(character);
    }

    public void add(Character character) {
        this.characters.add(character);
    }

    public void display() {
        for (Character character : this.characters) {
            System.out.println(character.getName());
        }
    }

    public boolean fight() {
        if (characters.size() < 2) {
            return false;
        }
        if (characters.get(0).compareTo(characters.get(1)) == 0) {
            characters.remove(0);
            characters.remove(0);
            return true;
        }
        if (characters.get(0).compareTo(characters.get(1)) > 0) {
            characters.remove(1);
            return true;
        } else {
            characters.remove(0);
            return true;
        }

    }
}
