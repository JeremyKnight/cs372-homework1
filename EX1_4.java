import java.util.Scanner;

public class EX1_4 {
    
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double weight=0;
        double height=0;

        System.out.println("Enter your weight in pounds: ");
        //PT -- name these numbers:
        //   final double POUNDS_PER_KG: 0.453592.
        // PT -- also, why nextLine rather than nextDouble? -1
        weight = Double.parseDouble(scnr.nextLine())*0.453592;
        System.out.println("Enter your height in inches: ");
        height = Double.parseDouble(scnr.nextLine())*0.0254;

        double BMI=weight/(height*height);
        System.out.println("your BMI is: " + BMI);
    }
}
