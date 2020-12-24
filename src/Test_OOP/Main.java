package Test_OOP;

import Test_OOP.Figures.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        Triangle triangle = new Triangle();
        Trapezoid trapezoid = new Trapezoid();
        Circle circle = new Circle();

        ArrayList<BaseFigure> figures = new ArrayList<>();

        int numOfFigures = Randomizer.generateNum();

        for (int i = 0;i < numOfFigures; i++){
              String figure = Randomizer.generateTypeOfFigure();

              switch (figure){
                  case "Triangle":
                      triangle.createFigure();
                      triangle.area = triangle.returnArea();
                      triangle.color = Randomizer.generateColor();
                      figures.add(new Triangle(triangle.area,triangle.color,triangle.getHypotenuse()));
                      break;
                  case "Trapezoid":
                      trapezoid.createFigure();
                      trapezoid.area = trapezoid.returnAreaOfSquareOrTrapezoid(trapezoid.getMiddleLine(),trapezoid.getHeight());
                      trapezoid.color = Randomizer.generateColor();
                      figures.add(new Trapezoid(trapezoid.area,trapezoid.color,trapezoid.getMiddleLine()));
                      break;
                  case "Circle":
                      circle.createFigure();
                      circle.area = circle.returnArea();
                      triangle.color = Randomizer.generateColor();
                      figures.add(new Circle(circle.area,circle.color,circle.getRadius()));
                      break;
                  case "Square":
                      square.setSide(Randomizer.generateNum());
                      square.area = square.returnAreaOfSquareOrTrapezoid(square.getSide(),square.getSide());
                      square.color = Randomizer.generateColor();
                      figures.add(new Square(square.area,square.color,square.getSide()));
                      break;
              }

            for(BaseFigure s : figures){
                System.out.println(s);
            }
        }


    }
}

