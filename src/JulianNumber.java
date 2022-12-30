//AUTHOR: INGRID JONE
public class JulianNumber {
    //First method: Date to Julian Number
    public static int toJulianNumber( int day, int month, int year ) {
        //Calculate conversion
        int result = ( 1461 * (year + 4800 + (month - 14 ) / 12 ) ) / 4 + ( 367 * (month - 2 - 12 * ( (month - 14 ) / 12 ) ) ) / 12 - ( 3 * ( ( year + 4900 + ( month - 14 ) / 12 ) / 100 ) ) / 4 + day - 32075;
        return result;
    }
    //Second method: Julian Number to Date
    public static int[] fromJulianNumber( int julianNumber ){
        //Declare array
        int[] arr;
        arr = new int[3];

        //Calculate conversion
        int l = julianNumber + 68569;
        int n = ( 4 * l ) / 146097; 
        l = l - ( 146097 * n + 3 ) / 4;
        int i = ( 4000 * ( l + 1 ) ) / 1461001; 
        l = l - ( 1461 * i ) / 4 + 31;
        int j = ( 80 * l ) / 2447;
        int day = l - ( 2447 * j ) / 80;
        l = j / 11;
        int month = j + 2 - ( 12 * l );
        int year = 100 * ( n - 49 ) + i + l;

        //Return array
        arr[0] = day;
        arr[1] = month;
        arr[2] = year;
        return arr;
    }
}
