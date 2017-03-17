import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int side1;
    private int side2;
    private int side3;
    private int side4;

    Menu() throws IOException {
        System.out.println("Please insert 4 sides : ");

        System.out.println("Side 1: ");
        side1 = Integer.parseInt(reader.readLine());

        System.out.println("Side 2: ");
        side2 = Integer.parseInt(reader.readLine());

        System.out.println("Side 3: ");
        side3 = Integer.parseInt(reader.readLine());

        System.out.println("Side 4: ");
        side4 = Integer.parseInt(reader.readLine());
    }

    public void whatToDo(){
        System.out.println("With what we will play? : ");

        System.out.println("1. Square" + "\n" + "2. Rhombus" + "\n" + "3. Rectangle");
        System.out.println();
        System.out.println("4. Triangle" + "\n" + "5. EquilateralTriangle" + "\n" + "6. IsoscelesTriangle");
        System.out.println();
        System.out.println("7. Circle" + "\n" + "8. Ellipse" + "\n" + "9. ResizableCircle");
        System.out.println();
        System.out.println("10. Exit");

        exce();

    }

    private void exce(){
        int buff = 0;
        boolean done = false;
        String dell = "";

        try {
            dell = reader.readLine();
            for (int i = 0; i < dell.length(); i++) {
                if (!Character.isDigit(dell.charAt(i))){
                    System.out.println("Wrong, Think what you are typing");
                    done = false;
                    break;
                }
                done = true;
            }


        } catch (IOException e) {
            System.out.println("Wrong, Think what you are typing");
            whatToDo();
        }

        if (done)buff = Integer.parseInt(dell);
        else whatToDo();

        takeDescision(buff);
    }

    private void takeDescision(int buff){
        if (buff == 1){
            dataSho("Square", new Square(this.side1));
            whatToDo();
        }else if (buff == 2){
            dataSho("Rhombus", new Rhombus(this.side1));
            whatToDo();
        }else if (buff == 3){
            System.out.println("We need additional size :");
            dataSho("Rectangle", new Rectangle(this.side1, this.side4));
            whatToDo();
        }else if (buff == 4){
            dataSho("Triangle", new Triangle(this.side1, this.side2, this.side3));
            whatToDo();
        }else if (buff == 5){
            dataSho("EquilateralTriangle", new EquilateralTriangle(this.side1, this.side2, this.side3));
            whatToDo();
        }else if (buff == 6){
            dataSho("IsoscelesTriangle", new IsoscelesTriangle(this.side1, this.side2, this.side3));
            whatToDo();
        }else if (buff == 7){
            dataSho("Circle", new Circle(this.side4));
            whatToDo();
        }else if (buff == 8){
            dataSho("Ellipse", new Ellipse(this.side4));
            whatToDo();
        }else if (buff == 9){
            dataSho("ResizableCircle", new ResizableCircle(this.side4));
            whatToDo();
        }else if (buff > 10) System.out.println("Out of Bound, Try Again!");
        else if (buff == 10) System.out.println("By by!");
    }

    public void dataSho(String name, Figure fig){
        System.out.println("If it would be " + name +"it would have : ");
        System.out.println("Perimeter : " + fig.perimeter() + "\n" + "Area : " + fig.area() + "\n" + "Angle : " + fig.angle());
        System.out.println();
    }

}
