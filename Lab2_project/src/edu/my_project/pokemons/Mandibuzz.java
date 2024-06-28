package edu.my_project.pokemons;

import edu.my_project.moves.Confide;
import edu.my_project.moves.DoubleTeam;
import edu.my_project.moves.DreamEater;
import edu.my_project.moves.RockSlide;
import ru.ifmo.se.pokemon.*;

public class Mandibuzz extends Pokemon {
    public Mandibuzz(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.FLYING);
        setStats(
                calculateStat(110, 424, level),  // HP
                calculateStat(65, 251, level),   // Attack
                calculateStat(105, 339, level),  // Defense
                calculateStat(55, 229, level),   // Special Attack
                calculateStat(95, 317, level),   // Special Defense
                calculateStat(80, 284, level)    // Speed
        );
        setMove(new Confide(), new DreamEater(), new DoubleTeam(), new RockSlide());
    }

    private double calculateStat(int base, int max, int level) {
        return base + (max - base) / 99.0 * (level - 1);
    }
}
