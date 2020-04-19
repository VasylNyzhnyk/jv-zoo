package core.basesyntax.controller;

import core.basesyntax.interfaces.Flyable;

//Aves(Latin) is a class of birds

public class Aves extends Animal implements Flyable {
    public Aves(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I like flying!.....");
    }
}
