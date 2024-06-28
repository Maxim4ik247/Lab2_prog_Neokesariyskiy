package edu.my_project.pokemons;

import edu.my_project.moves.Confide;
import edu.my_project.moves.DoubleTeam;
import edu.my_project.moves.DreamEater;
import ru.ifmo.se.pokemon.*;

public class Vullaby extends Pokemon {
    public Vullaby(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.FLYING);
        setStats(
                calculateStat(70, 334, level),  // HP
                calculateStat(55, 229, level),  // Attack
                calculateStat(75, 273, level),  // Defense
                calculateStat(45, 251, level),  // Special Attack
                calculateStat(65, 317, level),  // Special Defense
                calculateStat(60, 284, level)   // Speed
        );
        setMove(new Confide(), new DreamEater(), new DoubleTeam());
    }

    private double calculateStat(int base, int max, int level) {
        return base + (max - base) / 99.0 * (level - 1);
    }
}