package edu.my_project.pokemons;

import edu.my_project.moves.Facade;
import edu.my_project.moves.Swagger;
import edu.my_project.moves.Tackle;
import ru.ifmo.se.pokemon.*;

public class Palpitoad extends Pokemon {
    public Palpitoad(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.GROUND);
        setStats(
                calculateStat(75, 354, level),  // HP
                calculateStat(65, 251, level),  // Attack
                calculateStat(55, 229, level),  // Defense
                calculateStat(65, 251, level),  // Special Attack
                calculateStat(55, 229, level),  // Special Defense
                calculateStat(69, 260, level)   // Speed
        );
        setMove(new Swagger(), new Facade(), new Tackle());
    }

    private double calculateStat(int base, int max, int level) {
        return base + (max - base) / 99.0 * (level - 1);
    }
}