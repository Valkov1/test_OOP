package Test_OOP.Figures;

public class BaseFigure {
    public int area;
    public String color;

    public void createFigure(){
    }

    public int returnArea() {return area;}

    public int returnAreaOfSquareOrTrapezoid(int a, int b) {
        area = a * b;
        return area;}

    public BaseFigure(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public BaseFigure() {
    }

}
