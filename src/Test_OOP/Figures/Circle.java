package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Circle extends BaseFigure {

    private final double radius;

    public Circle() {
        super(Randomizer.randomColor());
        this.radius = Randomizer.randomNum();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea(){
        return Math.pow(radius,2)* 3.14;
    }

    @Override
    public String toString() {
        return String.format("figure= Circle" +
                        ", area= %.2f, radius= %.2f, color= %s",
                getArea(),radius,getColor());
    }
}
