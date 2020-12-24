package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Square extends BaseFigure {

    private double side;

    public Square() {
        super(Randomizer.generateColor());
        this.side = Randomizer.generateNum();
        calc();
    }

    private void calc(){
        this.setArea(side * side);
    }

    @Override
    public String toString() {
        return String.format("figure= Square" +
                        ", area= %.2f, side= %.2f, color= %s",
                        getArea(),side,getColor());
    }
}
