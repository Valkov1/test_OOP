package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Trapezoid extends BaseFigure {

    private final double upperSide;
    private final double loverSide;
    private final double height;

    public Trapezoid() {
        super(Randomizer.randomColor());
        this.upperSide = Randomizer.randomNum();
        this.loverSide = Randomizer.randomNum();
        this.height = Randomizer.randomNum();
    }

    public double getHeight() {
        return height;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public double getLoverSide() {
        return loverSide;
    }

    @Override
    double getArea(){
    return ((upperSide + loverSide)/2)*height;
    }

    @Override
    public String toString() {
        return String.format("figure= Trapezoid" +
                        ", area= %.2f, upperSide= %.2f, loverSide= %.2f, height= %.2f, color= %s",
                getArea(),upperSide,loverSide,height,getColor());
    }
}
