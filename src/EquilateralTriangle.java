
public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    public double area(){
        System.out.println("Same Calculation");
        double p = 0.5 * (getSide1() + getSide2() + getSide3());
        double h = 2 * Math.sqrt(p * (p-getSide1()) * (p-getSide2()) * (p-getSide3())) / getSide1();

        return 0.5 * getSide1() * h;
    }
}
