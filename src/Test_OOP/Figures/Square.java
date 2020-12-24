package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Square extends BaseFigure {
    private int side;

    public Square(int area, int side, String color) {
    }

    @Override
    public void createFigure(){
        side = Randomizer.generateNum();
    }



    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public String toString() {
        return "figure= Square" +
                ", side=" + side +
                ", area=" + area +
                ", color=" + color;
    }
}
