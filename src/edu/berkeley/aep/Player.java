package edu.berkeley.aep;

// Understands a RPS player that always plays rock



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


    public Player and(Player other) { return new Player(Unit.ROCK);}
}


