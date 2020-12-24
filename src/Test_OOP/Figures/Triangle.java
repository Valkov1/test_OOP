package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Triangle extends BaseFigure {

    private double hypotenuse;
    private double side1;
    private double side2;

    private void calc(){
        this.setArea((side1 * side2)/2);
        this.hypotenuse = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }

    public Triangle(){//конструктор с случ числами
        super(Randomizer.generateColor());
        this.side1 = Randomizer.generateNum();
        this.side2 = Randomizer.generateNum();
        calc();
    }

    public Triangle(int side1, int side2, String color) {//конструктор с параметрами
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        calc();
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public String toString() {
        return String.format("figure= Triangle" +
                ", hypotenuse= %.2f, area= %.2f, side1= %.2f, side2= %.2f, color= %s",
                hypotenuse, getArea(),side1,side2,getColor());
    }
}
