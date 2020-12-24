package Test_OOP;

public class Randomizer {

    public static int generateNum(){
        return (int) (Math.random() * 10);
    }

    public static String generateColor(){
        String color;
        String [] colors = {"red","blue","green","white","black","yellow",
                "purple","grey","orange","pink"};
        color = colors[(int) (Math.random() * 10)];
        return color;
    }

    public static String generateTypeOfFigure(){
        int x = (int) (Math.random() * 10);
        if(x>3){
            x=-3;
        }
        if(x>3){
            x=-3;
        }
        if(x>3){
            x=-3;
        }
        String figure;
        switch (x){
            case 1:
                figure = "Triangle";
                break;
            case 2:
                figure = "Trapezoid";
                break;
            case 3:
                figure = "Circle";
                break;
            default:
                figure = "Square";
        }
        return figure;
    }
}
