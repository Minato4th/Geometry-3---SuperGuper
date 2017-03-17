
public class Ellipse extends Circle {
    public Ellipse(int side1) {
        super(side1);
    }

    public double area(){
        System.out.println("It is to complicate to calculate, let it be - ");
        return getSide2() * getSide1() * 3.14 / 1.25;
    }

}
