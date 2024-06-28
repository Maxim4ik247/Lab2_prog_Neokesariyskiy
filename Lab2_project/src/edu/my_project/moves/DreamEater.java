package edu.my_project.moves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition() == Status.SLEEP) {
            def.setMod(Stat.HP, - (int) Math.round(damage));
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double restoredHP = p.getStat(Stat.HP) * 0.5;
        p.setMod(Stat.HP, (int) Math.round(restoredHP));
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return def.getCondition() == Status.SLEEP && super.checkAccuracy(att, def);
    }

    @Override
    protected String describe() {
        return "Dream Eater";
    }
}