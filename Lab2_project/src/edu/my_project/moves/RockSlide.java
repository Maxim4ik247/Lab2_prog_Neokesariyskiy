package edu.my_project.moves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.3) {
            Effect.flinch(def);
        }
    }

    @Override
    protected String describe() {
        return "Rock Slide";
    }
}