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

    @Test
    public void scissorsShouldWinOverPaper() {
        var scissors = new Player(Unit.SCISSORS);
        var paper = new Player(Unit.PAPER);
        assertEquals(scissors.and(paper), scissors);
    }

    @Test
    public void paperShouldLoseOverScissors() {
        var paper = new Player(Unit.PAPER);
        var scissors = new Player(Unit.SCISSORS);
        assertEquals(paper.and(scissors), scissors);

    }

    @Test(expected = RuntimeException.class)
    public void rockAndRockShouldReturnNoWinner() {
        var rock1 = new Player(Unit.ROCK);
        var rock2 = new Player(Unit.ROCK);
        assertEquals(rock1.and(rock2), rock1.and(rock2));
    }

    @Test(expected = RuntimeException.class)
    public void paperAndPaperShouldReturnNoWinner() {
        var paper1 = new Player(Unit.PAPER);
        var paper2 = new Player(Unit.PAPER);
        assertEquals(paper1.and(paper2), paper1.and(paper2));
    }

    @Test(expected = RuntimeException.class)
    public void scissorsAndScissorsShouldReturnNoWinner() {
        var scissors1 = new Player(Unit.SCISSORS);
        var scissors2 = new Player(Unit.SCISSORS);
        assertEquals(scissors1.and(scissors2), scissors1.and(scissors2));
    }

}
