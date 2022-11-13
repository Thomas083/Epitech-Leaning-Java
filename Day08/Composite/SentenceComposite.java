package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence {
    private List<Sentence> childSentence;

    @Override
    public void print() {
        for (Sentence sentence : childSentence) {
            sentence.print();
        }
    }

    public SentenceComposite() {
        childSentence = new ArrayList<>();
    }

    public void add(Sentence sentence) {
        childSentence.add(sentence);
    }

    public void remove(Sentence sentence) {
        childSentence.remove(sentence);
    }
}
