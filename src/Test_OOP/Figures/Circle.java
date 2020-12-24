package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Circle extends BaseFigure {
    private int radius;

    public Circle(int area, int radius, String color) {

    }


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


    public Circle(int radius) {
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
