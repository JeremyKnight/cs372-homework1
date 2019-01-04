import java.util.Scanner;
import java.lang.Math;

public class EX1_3 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String number = "";

        System.out.println("Please enter a number");
        number = scnr.nextLine();
        
        //if a char at number(0) is int then return the number as a string
        //else say that isn't allowed

        if(Character.getNumericValue(number.charAt(0))<10){
            int newNumber=0;
            String temp = "";
            for(int i=0;i<number.length(); i++){
                temp+=Character.getNumericValue(number.charAt(i));
            }
            for(int i=0; i<temp.length(); i++) {
                //newNumber += Character.getNumericValue(temp.charAt(i)); //* (temp.length()-i);
                newNumber += Character.getNumericValue(temp.charAt(i)) * Math.pow(10,temp.length()-i-1);
            }
            //newNumber = Integer.parseInt(temp);
            System.out.println(newNumber);
        }
        else {
            System.out.println("you did not input member.");
        }
    }
}