package edu.my_project.pokemons;

import edu.my_project.moves.Facade;
import edu.my_project.moves.FireBlast;
import edu.my_project.moves.Swagger;
import edu.my_project.moves.Tackle;
import ru.ifmo.se.pokemon.*;

public class Seismitoad extends Pokemon {
    public Seismitoad(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.GROUND);
        setStats(
                calculateStat(105, 414, level),  // HP
                calculateStat(95, 317, level),   // Attack
                calculateStat(75, 273, level),   // Defense
                calculateStat(85, 295, level),   // Special Attack
                calculateStat(75, 273, level),   // Special Defense
                calculateStat(74, 284, level)    // Speed
        );
        setMove(new Swagger(), new Facade(), new Tackle(), new FireBlast());
    }

    private double calculateStat(int base, int max, int level) {
        return base + (max - base) / 99.0 * (level - 1);
    }
}