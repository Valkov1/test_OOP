package Test_OOP.Figures;

import Test_OOP.Randomizer;

public class Triangle extends BaseFigure {

    private int hypotenuse;
    private int side1;
    private int side2;


    @Override
    public void createFigure(){
        side1 = Randomizer.generateNum();
        side2 = Randomizer.generateNum();
        hypotenuse = Randomizer.generateNum();
    }

    @Override
    public int returnArea() {
        area = (side1*side2)/2;
        return area;
    }


    public int getHypotenuse() {
        return hypotenuse;
    }

    public Triangle(){

    }

    public Triangle(int area, String color, int hypotenuse) {
        super(area, color);
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return "figure= Triangle" +
                ", hypotenuse=" + hypotenuse +
                ", area=" + area +
                ", color=" + color;
    }
}
