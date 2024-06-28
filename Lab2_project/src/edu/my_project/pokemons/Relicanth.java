package edu.my_project.pokemons;

import edu.my_project.moves.*;
import ru.ifmo.se.pokemon.*;

public class Relicanth extends Pokemon {
    public Relicanth(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ROCK);
        setStats(
                calculateStat(100, 404, level),  // HP
                calculateStat(90, 350, level),   // Attack
                calculateStat(130, 394, level),  // Defense
                calculateStat(45, 251, level),   // Special Attack
                calculateStat(65, 317, level),   // Special Defense
                calculateStat(55, 295, level)    // Speed
        );
        setMove(new Facade(), new SonicBoom(), new DoubleTeam(), new Confide());
    }

    private double calculateStat(int base, int max, int level) {
        return base + (max - base) / 99.0 * (level - 1);
    }
}