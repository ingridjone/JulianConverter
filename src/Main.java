//AUTHOR: INGRID JONE
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int result = JulianNumber.toJulianNumber(1, 2, 1957);
        int[] dayMonthYear = JulianNumber.fromJulianNumber(result);

        System.out.println(result);
        System.out.println(Arrays.toString(dayMonthYear));
    }
}