package edu.berkeley.aep;

// Understands the probability of a particular outcome
public class Chance {
    private final double probability;

    //Constructor
    public Chance (double probability){
        this.probability = probability;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if(!(other instanceof Chance)) return false;
        return Double.compare(probability, ((Chance) other).probability) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(probability);
    }

    // A method for getting the complement of the probability
    public Chance not(){
        return new Chance(1.0 - probability);
    }

    // A method for multiplying two probabilities
    public Chance and(Chance other){
        return new Chance (this.probability * other.probability);
    }

    // A method for that calculates the chances of either of two events happening
    public Chance or(Chance eventTwo) {
        return new Chance( this.probability + eventTwo.probability - this.probability * eventTwo.probability );
    }

}

