package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void rockShouldWinOverScissors() {
        var rock = new Player(Rock);
        var scissors = new Player(Scissors);

        var bester = new Bester(rock, scissors);
        assertEquals(rock, bester.best);
    }
}
