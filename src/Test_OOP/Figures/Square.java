package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Square extends BaseFigure {

    private final double side;

    public Square() {
        super(Randomizer.randomColor());
        this.side = Randomizer.randomNum();
    }

    public double getSide() {
        return side;
    }

    @Override
    double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("figure= Square" +
                        ", area= %.2f, side= %.2f, color= %s",
                        getArea(),side,getColor());
    }
}
