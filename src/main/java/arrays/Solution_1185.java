package arrays;

/**
 * Zhouxi O_o
 *
 * @author xi
 * @description
 */
public class Solution_1185 {

    String[] res = {"Thursday","Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
    int[] month_1 = {0, 31, 28 + 31, 31 + 28 + 31, 31 + 28 + 31 + 30, 31 + 28 + 31 + 30 + 31,
            31 + 28 + 31 + 30 + 31 + 30, 31 + 28 + 31 + 30 + 31 + 30 + 31,
            31 + 28 + 31 + 30 + 31 + 30 + 31 + 31, 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30,
            31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31,
            31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30};
    int[] month_2 = {0, 31, 29 + 31, 31 + 29 + 31, 31 + 29 + 31 + 30, 31 + 29 + 31 + 30 + 31,
            31 + 29 + 31 + 30 + 31 + 30, 31 + 29 + 31 + 30 + 31 + 30 + 31,
            31 + 29 + 31 + 30 + 31 + 30 + 31 + 31, 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30,
            31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31,
            31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30};

    public String dayOfTheWeek( int day, int month, int year ) {
        int sumDay = 0;
        for (int i = 1971; i < year ; i++) {
            if (i % 100 == 0 && i % 400 == 0) {
                sumDay += 366;
            } else if (i % 4 == 0) {
                sumDay += 366;
            } else {
                sumDay += 365;
            }
        }
        if (year % 100 == 0 && year % 400 == 0) {
            sumDay += month_2[month-1] + day;
        } else if (year % 4 == 0) {
            sumDay += month_2[month-1] + day;
        } else {
            sumDay += month_1[month-1] + day;
        }

        return res[(sumDay) % 7];

    }


    public static void main( String[] args ) {
        System.out.println(new Solution_1185().dayOfTheWeek(18,7,1999));
    }
}
