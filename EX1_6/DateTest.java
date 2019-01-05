import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.println("enter a day");
        day = Integer.parseInt(scnr.nextLine());
        System.out.println("enter a month");
        month = Integer.parseInt(scnr.nextLine());
        System.out.println("enter a year");
        year = Integer.parseInt(scnr.nextLine());
        Date date = new Date(day, month, year);

        
    }
}