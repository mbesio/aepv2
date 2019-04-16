package edu.berkeley.aep;

// Understands a four sided object with 90 degrees angles.
public class Rectangle {
    private int length;
    private int width;

    //Constructor for the Rectangle
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }

    // A method for computing the area of the rectangle
    public int Area(){
        return width*length;
    }

    //A method for computing the perimeter of the rectangle
    public int getPerimeter(){
        return 2*(width + length);
    }
}