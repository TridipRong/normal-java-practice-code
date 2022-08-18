package Q3;

public class Area extends Shapes{
    public int rectangleArea(int length, int breadth) {
        return length*breadth;
    }

    @Override
    public int squareArea(int side) {
        return side*side;
    }

    @Override
    public int circleArea(int radius) {
        return (int) (2.14*radius*radius);
    }
}
