
public class Rhombus extends Square {
    public Rhombus(int side1) {
        super(side1);
    }

    public double area(){
        System.out.println("It is to complicate to calculate, let it be - ");
        return 0.5 * getSide1() * getSide1();
    }
}
