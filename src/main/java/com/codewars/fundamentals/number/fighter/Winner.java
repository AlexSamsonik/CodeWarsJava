package com.codewars.fundamentals.number.fighter;

/**
 * Two fighters, one winner.
 * Create a function that returns the name of the winner in a fight between two fighters.
 * Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
 * Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
 * Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
 */
public class Winner {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = null;

        if (firstAttacker.equals(fighter1.name)) {
            winner = getWinner(fighter1, fighter2, winner, fighter1.health > 0, fighter2.health > 0);
        } else {
            winner = getWinner(fighter2, fighter1, winner, fighter1.health > 0, fighter2.health > 0);
        }
        return winner;
    }

    private static String getWinner(Fighter fighter1, Fighter fighter2, String winner, boolean b1, boolean b2) {
        do {
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            if (fighter2.health <= 0) {
                winner = fighter1.name;
                break;
            }
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
            if (fighter1.health <= 0) {
                winner = fighter2.name;
                break;
            }
        } while ((b1) | (b2));
        return winner;
    }
}