package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Circle extends BaseFigure {

    private double radius;

    public Circle() {
        super(Randomizer.generateColor());
        this.radius = Randomizer.generateNum();
        calc();
    }

    private void calc(){
        this.setArea(Math.pow(radius,2)* 3.14);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("figure= Circle" +
                        ", area= %.2f, radius= %.2f, color= %s",
                getArea(),radius,getColor());
    }
}
