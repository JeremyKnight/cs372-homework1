import java.time;

public class Date {
    int day;
    int month;
    int year;

    private boolean checkDate(int day, int month) {
        if(day>31 || month>12)
            return false;
            //throw new IllegalArguementException("illegal date called");
        if(month==2 || month==4 || month==6 || month==9|| month==11) {
            if(day>31 || (month==2 && day>28)){
                //throw new IllegalArguementException("illegal date called");
                return false;
            }
        }
        return true;
    }

    Date(int d, int m, int y){
        if(checkDate(d,m)==true){
            day=d;
            month=m;
            year=y;
        }
        else {
            System.out.println("illegal parameters");
        }
    }

    public int getDay(){ return day; }
    public void setDay(int d){ 
         if(checkDate(d,month)==true){
            day=d;
        }
        else {
            System.out.println("illegal parameters");
        }
    } 

    public int getMonth() { return month; }
    public void setMonth(int m) {
         if(checkDate(day,m)==true){
            month=m;
        }
        else {
            System.out.println("illegal parameters");
        }
    }

    public int getYear() { return year; }
    public void setYear(int y) {year = y;}

   /* public static String today() {
        return 
    }*/ 

    public int getDiffrence(Date date) {
        //convert months and day into a days, then subtract.
        int difference=0;
        int changeMonth=month-date.getMonth();

        if(changeMonth<0){
            while(changeMonth!=0){
                difference+=(day-date.getDay());
                changeMonth++;
            }
        } else if(changeMonth>0) {
            while(changeMonth!=0){
                difference+=(day-date.getDay());
                changeMonth--;
            }
        } else {
            return day-date.getDay();
        }

        return difference;
    }


}