package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Trapezoid extends BaseFigure {

    private int middleLine;
    private int height;

    @Override
    public void createFigure(){
        middleLine = Randomizer.generateNum();
        height = Randomizer.generateNum();
    }

    public Trapezoid(int area, String color, int middleLine) {
        super(area, color);
        this.middleLine = middleLine;
    }

    public int getMiddleLine() {
        return middleLine;
    }

    public int getHeight() {
        return height;
    }

    public Trapezoid(){
    }

    @Override
    public String toString() {
        return "figure= Trapezoid" +
                ", middle line=" + middleLine +
                ", area=" + area +
                ", color=" + color;
    }
}
