package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Trapezoid extends BaseFigure {

    private double middleLine;
    private double height;

    public Trapezoid() {
        super(Randomizer.generateColor());
        this.middleLine = Randomizer.generateNum();
        this.height = Randomizer.generateNum();
        calc();
    }

    private void calc(){
        this.setArea(middleLine*height);
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("figure= Trapezoid" +
                        ", area= %.2f, middleLine= %.2f, height= %.2f, color= %s",
                getArea(),middleLine,height,getColor());
    }
}
