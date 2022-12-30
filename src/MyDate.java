//AUTHOR: INGRID JONE
public class MyDate {
        //Enter date here
        public MyDate(){
            julianNumber = toJulianNumber( 1, 1, 1970 );
        }
        /* Creates a new MyDate from an existing MyDate */
        public MyDate( MyDate date){
            julianNumber = date.julianNumber;
        }
        /* Creates a new MyDate from a day, month, and year */
        public MyDate( int day, int month, int year){
            julianNumber = toJulianNumber( day, month, year);
        }

        //Returns the array index that corresponds to the day
        public int getDay(){
            return fromJulianNumber()[0];
        }
        //Returns the array index that corresponds to the month
        public int getMonth(){
            return fromJulianNumber()[1];
            }
        //Returns the array index that corresponds to the year
        public int getYear(){
            return fromJulianNumber()[2];
        }

        //Calculates if it's a leap year (true) or not (false)
        public static boolean isLeapYear( int year ){
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        
        //Given a month and a year, calculates which day would be the last of the month
        public static int getLastDayOfMonth( int month, int year ){
            //If statement to check if the month has 31 days
           if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            //Returns the result "31"
            return 31;
           }
           //If statement to check if the month has 30 days
           if (month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
           }
           //If statement to check if the month has 28 or 29 days (only affects February)
           if (month == 2){
            if (isLeapYear(year)) {
                return 29;
            }
            //If it's not a leap year, returns "28"
            else {
                return 28;
            }
           }
           return 0;
        }
    
        /* This internal method returns the calculated Julian number for the provided day, month, year
         * This method is static, as it does not require a MyDate object to perform its computation
         */
        private static int toJulianNumber(int day, int month, int year){
            //The if statement checks if the month provided is larger than 12 OR smaller than 0, and prints an error message
                if (month > 12 || month < 0 ) {
                    throw new IllegalArgumentException("You entered a value outside the acceptable 1-12 MONTH range. Please try again!");
                }
                //This if statement checks if the day entered is larger than 31 OR smaller than 1
                if (day > 31 || day < 1 ) {
                    throw new IllegalArgumentException("You entered a value outside the acceptable 1-31 DAY range. Please try again!");
                }
                else {
            return JulianNumber.toJulianNumber(day, month, year); }
        }
        /* This internal method returns a 3-integer array 
         * containing the day, month, and year of this MyDate
         */
        private int[] fromJulianNumber(){
            return JulianNumber.fromJulianNumber(julianNumber);
        }
    
        /* This private data member holds the calculated Julian number for this MyDate */
        private int julianNumber; 
}
