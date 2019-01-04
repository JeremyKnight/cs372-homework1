import java.util.Scanner;

public class EX1_2 {
    static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double radius=0;

        System.out.println("enter the radius of a circle");
        radius = Double.parseDouble(scnr.nextLine());

        double area = PI * (radius * radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }

}