package Test_OOP.Figures;

public class BaseFigure {
    private double area;
    private String color;

    public BaseFigure() {
    }

    public BaseFigure(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

}
