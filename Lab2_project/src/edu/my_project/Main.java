package edu.my_project;

import edu.my_project.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        // Team 1
        Pokemon relicanth = new Relicanth("Relicanth", 50);
        Pokemon vullaby = new Vullaby("Vullaby", 50);
        Pokemon mandibuzz = new Mandibuzz("Mandibuzz", 50);

        // Team 2
        Pokemon tympole = new Tympole("Tympole", 50);
        Pokemon palpitoad = new Palpitoad("Palpitoad", 50);
        Pokemon seismitoad = new Seismitoad("Seismitoad", 50);

        // Adding Pokemons to the battle
        battle.addAlly(relicanth);
        battle.addAlly(vullaby);
        battle.addAlly(mandibuzz);

        battle.addFoe(tympole);
        battle.addFoe(palpitoad);
        battle.addFoe(seismitoad);

        // Start the battle
        battle.go();
    }
}