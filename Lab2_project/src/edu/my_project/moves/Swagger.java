package edu.my_project.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect.confuse(def);
        def.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "Swagger";
    }
}