package adapter;

import adaptee.JPAdaptee;
import target.Vietnamese;

public class Translate implements Vietnamese {
    JPAdaptee jpAdaptee;

    public Translate(JPAdaptee jpAdaptee) {
        this.jpAdaptee = jpAdaptee;
    }

    String translated(String s) {
        return "hello";
    }

    @Override
    public void send(String a) {
        System.out.println("Translated: ");
        jpAdaptee.receive(translated(a));

    }
}
