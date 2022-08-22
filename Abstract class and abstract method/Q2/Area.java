package Q2;

public class Area extends Shape{
    public int rectangleArea(int length, int breadth) {
        return length*breadth;
    }
    public int squareArea(int side) {
        return side*side;
    }
    public int circleArea(int radius) {
        return (int) (2.14*radius*radius);
    }
}
