import java.io.IOException;

public class Triangle extends Figure implements Calculation, Resizable{
    public Triangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    public void change(){
        try {
            setSide1(Integer.parseInt(reader.readLine()));
            setSide2(Integer.parseInt(reader.readLine()));
            setSide3(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            System.out.println("something go wrong, try Again!");
            change();
        }
    }

    public double perimeter(){
        return getSide1() + getSide2() + getSide3();

    }

    public double area(){
        double p = 0.5 * (getSide1() + getSide2() + getSide3());
        double h = 2 * Math.sqrt(p * (p-getSide1()) * (p-getSide2()) * (p-getSide3())) / getSide1();

        return 0.5 * getSide1() * h;
    }

    public double angle(){
        return 170;
    }
}
