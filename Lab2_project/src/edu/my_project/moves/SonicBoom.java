package edu.my_project.moves;

import ru.ifmo.se.pokemon.*;

public class SonicBoom extends SpecialMove {
    public SonicBoom() {
        super(Type.NORMAL, 0, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(def.getHP() - 20));
    }

    @Override
    protected String describe() {
        return "Sonic Boom";
    }
}