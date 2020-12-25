package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Triangle extends BaseFigure {

    private final double side1;
    private final double side2;

    public Triangle(){//конструктор с случ числами
        super(Randomizer.randomColor());
        this.side1 = Randomizer.randomNum();
        this.side2 = Randomizer.randomNum();
    }

    @Override
    double getArea(){
        return (side1 * side2)/2;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
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
                getHypotenuse(), getArea(),side1,side2,getColor());
    }
}
