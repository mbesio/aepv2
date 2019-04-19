package edu.berkeley.aep;

// Understands a RPS player

import java.util.Random;

public class Player {
    private final Unit unit;

    public Player(Unit unit) {
        this.unit = unit;
    }


    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Player)) return false;
        return unit == ((Player) other).unit;
    }

//    @Override
//    public int hashCode() {
//        return Double.hashCode(unit);
//    }


    public Player and(Player other) {
        if (unit == Unit.PAPER && other.unit == Unit.ROCK || unit == Unit.ROCK && other.unit == Unit.PAPER)
            return new Player(Unit.PAPER);
        else if (unit == Unit.SCISSORS && other.unit == Unit.PAPER || unit == Unit.PAPER && other.unit == Unit.SCISSORS)
            return new Player(Unit.SCISSORS);
        else if (unit == Unit.ROCK && other.unit == Unit.ROCK || unit == Unit.PAPER && other.unit == Unit.PAPER || unit == Unit.SCISSORS && other.unit == Unit.SCISSORS)
            throw new IllegalArgumentException("No winner");
        else return new Player(Unit.ROCK);
    }


}


