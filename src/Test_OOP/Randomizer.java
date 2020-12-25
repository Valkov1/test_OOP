package Test_OOP;

public class Randomizer {

    public static int randomNum(){
        return getRandomInt(1,10);
    }

    public static int getRandomInt(int min, int max){
        return (int)((Math.random()*(max - min))+min);//[min;max)
    }

    public static String randomColor(){
        String color;
        String [] colors = {"red","blue","green","white","black","yellow",
                "purple","grey","orange","pink"};
        color = colors[getRandomInt(1,10)];
        return color;
    }

    public static String randomTypeOfFigure(){
        String figure;
        switch (getRandomInt(1,5)){
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
