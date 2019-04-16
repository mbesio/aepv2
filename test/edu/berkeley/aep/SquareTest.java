package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void SquareWithSideOneShouldHaveAreaOne(){
        var rect = new Square(1);
        assertEquals(1, rect.Area());
    }

    @Test
    public void squareWithSideFourShouldHaveAreaSixteen(){
        var rect = new Square (4);
        assertEquals(16, rect.Area());
    }

    @Test
    public void squareWithSideFourShouldHavePerimeterSixteen(){
        var rect = new Square(4);
        int perimeter;
        perimeter = rect.getPerimeter();
        assertEquals(16, perimeter);
    }
}