package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void rockShouldWinOverScissors() {
        var rock = new Player(Unit.ROCK);
        var scissors = new Player(Unit.SCISSORS);
        assertEquals(rock.and(scissors), rock);
    }

    @Test
    public void paperShouldWinOverRock() {
        var paper = new Player(Unit.PAPER);
        var rock = new Player(Unit.ROCK);
        assertEquals(paper.and(rock), paper);
    }

}

