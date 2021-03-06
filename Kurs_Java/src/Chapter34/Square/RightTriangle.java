package Chapter34.Square;

public class RightTriangle implements ISquare{
    private final double length, width;

    public RightTriangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void getSquareInfo() {
        System.out.println("Square of right triangle is " +
                length * width / 2);
    }
}
