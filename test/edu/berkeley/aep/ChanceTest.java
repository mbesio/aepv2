package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {
    @Test
    public void notChanceZeroShouldBeOne(){
        Chance zero = new Chance(0.0);
        assertEquals(new Chance(1.0), zero.not());
    }
    @Test
    public void notOfHalfChanceShouldBeHalfToo(){
        Chance half = new Chance(0.5);
        assertEquals(new Chance(0.5), half.not());
    }
    @Test
    public void notShouldProduceTheComplementOfTheProbability(){
        Chance chanceNot = new Chance(1d/6d);
        assertEquals(new Chance(5d/6d), chanceNot.not());
    }

    @Test
    public void andShouldMultiplyTwoProbabilities(){
        Chance firstDice = new Chance (1d/6d);
        Chance secondDice = new Chance (2d/6d);
        assertEquals( new Chance((1d/6d) * (2d/6d) ), firstDice.and(secondDice));
    }

    @Test
    public void andAppliedToItselfShouldMultiplyItsOwnProbability(){
        Chance firstDice = new Chance (1d/6d);
        assertEquals( new Chance((1d/6d) * (1d/6d) ), firstDice.and(firstDice));
    }

    @Test
    public void orAppliedToTwoCertainEventsShouldReturnOne(){
        Chance eventOne = new Chance(1d);
        Chance eventTwo = new Chance( 1d);
        assertEquals(new Chance (1), eventOne.or(eventTwo));
    }

    @Test
    public void orAppliedToTwoDiceShouldBeElevenOverThirtySix(){
        Chance eventOne = new Chance(1d/6d);
        Chance eventTwo = new Chance( 1d/6d);
        assertEquals(new Chance (1d/6d + 1d/6d - (1d/6d ) * (1d/6d )), eventOne.or(eventTwo));
    }


}