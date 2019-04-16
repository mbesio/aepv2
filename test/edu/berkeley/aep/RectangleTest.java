package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void rectangleWithSideOneShouldHaveAreaOne(){
        var rect = new Rectangle(1,1);
        assertEquals(1, rect.Area());
    }

    @Test
    public void rectangleWithWidthFourAndHeightTwoShouldAreaEight(){
        var rect = new Rectangle(4,2);
        assertEquals(8, rect.Area());
    }

    @Test
    public void rectangleWithWidthFourAndHeightTwoShouldPerimeterTwelve(){
        Rectangle rect = new Rectangle(4,2);
        int perimeter;
        perimeter = rect.getPerimeter();
        assertEquals(12, perimeter);
    }
}
