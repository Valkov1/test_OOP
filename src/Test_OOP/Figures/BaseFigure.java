package Test_OOP.Figures;

public abstract class BaseFigure {

    private final String color;

    BaseFigure(String color) {
        this.color = color;
    }

    abstract double getArea();

    String getColor() {
        return color;
    }

}
