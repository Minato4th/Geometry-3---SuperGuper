
public class ResizableCircle extends Circle{
    public ResizableCircle(int side1) {
        super(side1);
    }

    public double area(){
        System.out.println("It is imposable to calculate, let it be - ");
        return getSide1() * 25 / 31;
    }
}
