package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Circle extends BaseFigure {
    private int radius;


    @Override
    public int returnArea(){
        area = radius*radius*3;
        return area;
    }

    @Override
    public void createFigure(){
        radius = Randomizer.generateNum();
    }

    public int getRadius() {
        return radius;
    }


    public Circle(int area, String color, int radius) {
        super(area, color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "figure= Circle" +
                ", radius=" + radius +
                ", area=" + area +
                ", color=" + color;
    }
}
