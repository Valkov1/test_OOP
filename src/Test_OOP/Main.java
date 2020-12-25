package Test_OOP;

import Test_OOP.Figures.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseFigure> figures = new ArrayList<>();

        int numOfFigures = Randomizer.randomNum();

        for (int i = 0;i < numOfFigures; i++){
              String figure = Randomizer.randomTypeOfFigure();

              switch (figure){
                  case "Triangle":
                      figures.add(new Triangle());
                      break;
                  case "Trapezoid":
                      figures.add(new Trapezoid());
                      break;
                  case "Circle":
                      figures.add(new Circle());
                      break;
                  case "Square":
                      figures.add(new Square());
                      break;
              }
        }

        for(BaseFigure s : figures){
            System.out.println(s);
        }

    }
}

