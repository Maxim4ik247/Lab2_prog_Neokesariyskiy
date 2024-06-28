package edu.my_project.moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.1) {
            Effect.burn(def);
        }
    }

    @Override
    protected String describe() {
        return "Fire Blast";
    }
}