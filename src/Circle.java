import java.io.IOException;

public  class Circle extends Figure implements Calculation, Resizable {

    public Circle(int side1) {
        super(side1);
    }

    public void change(){
        try {
            setSide1(Integer.parseInt(reader.readLine()));
            setSide2(getSide1());
            setSide3(getSide1());
            setSide4(getSide1());
        } catch (IOException e) {
            System.out.println("something go wrong, try Again!");
            change();
        }
    }

    public double perimeter(){
        return getSide1() * 2 * 3.14;
    }

    public double area(){
        return getSide2() * getSide1() * 3.14;
    }

    public double angle(){
        return 360;
    }
}
