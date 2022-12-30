//AUTHOR: INGRID JONE
public class MyDateTest {
    public static void main(String[] args) {
        //Since most methods except two are NOT static, I created an instance first:
        MyDate date = new MyDate();

        //Declare variables
        int getDay = date.getDay();
        int getMonth = date.getMonth();
        int getYear = date.getYear();

        //Declare integer that takes month and year from the MyDate class and calculates if the last day is 28, 29, 30, or 31
        int getLastDayOfMonth = MyDate.getLastDayOfMonth(getMonth, getYear);

        //Declare boolean that takes the year from the MyDate class, and checks if it's a leap year
        boolean isLeapYear = MyDate.isLeapYear(getYear);

        //Print results
        System.out.println("The date is: "+getMonth+"/"+getDay+"/"+getYear);
        System.out.println("Day: "+getDay);
        System.out.println("Month: "+getMonth);
        System.out.println("Year: "+getYear);
        System.out.println("The last day of the month is: "+getLastDayOfMonth);
        System.out.println("Is it a leap year? "+isLeapYear);
    }
    
}
