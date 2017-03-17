
public class Rectangle extends Square {
    private double side2;
    public Rectangle(int side1, int side2) {
        super(side1);
        this.side2 = side2;
    }

    public double area(){
        return getSide1() * side2;
    }
}
