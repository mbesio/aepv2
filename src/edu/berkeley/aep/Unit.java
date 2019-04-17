package edu.berkeley.aep;

public enum Unit {
    ROCK("draw", "lose", "win"),
    PAPER("win", "draw", "lose"),
    SCISSORS("lose", "win", "draw");

    private final String vsRock;
    private final String vsPaper;
    private final String vsScissors;

    Unit(String vsRock, String vsPaper, String vsScissors) {
        this.vsRock = vsRock;
        this.vsPaper = vsPaper;
        this.vsScissors = vsScissors;
    }

}

