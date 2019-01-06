import java.util.Scanner;
import java.lang.Math;

public class Employee {
    int id;
    String name;
    String hireDate;
    String position;
    String personReportedTo;

    Employee(String n, String hD, String p, String pRT) {
        id = (int)(Math.random() * 100000);
        name = n;
        hireDate = hD;
        position = p;
        personReportedTo = pRT;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
     
    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    public String getPersonReportedTo() {
        return personReportedTo;
    }

    //PT -- set functions? -3
    
    //PT -- also, consider overriding toString()
}
