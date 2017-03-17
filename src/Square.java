import java.io.IOException;

public class Square extends Figure implements Calculation, Resizable{

    public Square(int side1) {
        super(side1);
    }

    public void change(){
        try {
            setSide1(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            System.out.println("something go wrong, try Again!");
            change();
        }
    }

    public double perimeter(){
        return getSide1() + getSide1() + getSide1() + getSide1();
    }

    public double area(){
        return getSide1() * getSide1();
    }

    public double angle(){
        return 90;
    }

}

