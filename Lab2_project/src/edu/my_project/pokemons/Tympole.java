package edu.my_project.pokemons;

import edu.my_project.moves.Facade;
import edu.my_project.moves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Tympole extends Pokemon {
    public Tympole(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(
                calculateStat(50, 304, level),  // HP
                calculateStat(50, 218, level),  // Attack
                calculateStat(40, 196, level),  // Defense
                calculateStat(50, 218, level),  // Special Attack
                calculateStat(40, 196, level),  // Special Defense
                calculateStat(64, 249, level)   // Speed
        );
        setMove(new Swagger(), new Facade());
    }

    private double calculateStat(int base, int max, int level) {
        return base + (max - base) / 99.0 * (level - 1);
    }
}