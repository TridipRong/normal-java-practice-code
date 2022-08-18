package day3;

public class CheckWeather {
    public static void main(String[] args) {


        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        if(isSnowing==true){
            System.out.println("Let’s stay home.");
        } else if (isRaining==true) {
            System.out.println("Let’s stay home.");
        }
        else if (temperature<=50) {
            System.out.println("Let’s go out!");
        }
    }
}
