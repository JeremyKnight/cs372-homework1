import java.util.Scanner;
import java.io.*; 
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        boolean stop = false;
        ArrayList<Employee> employeeList = new ArrayList<Employee>(10);
        while(!stop) {
            String name;
            String hireDate;
            String position;
            String personReportedTo;

            System.out.println("enter employee name: ");
            name = scnr.nextLine();
            System.out.println("enter hire date: (XX/XX/XXXX) ");
            hireDate = scnr.nextLine();
            System.out.println("enter postion: ");
            position = scnr.nextLine();
            System.out.println("enter name of the person that they report to. ");
            personReportedTo = scnr.nextLine();

            Employee employee = new Employee(name, hireDate, position , personReportedTo);

            employeeList.add(employee);

            String response;
            System.out.println("add another employee? (y=yes, n=no)");
            response = scnr.nextLine();

            if(response == "n" )
                stop = true;

        }
        //System.out.println("enter a")
    }
}