public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    static String myDate(){
        return String.format("%d-%02d-%02d", year, month, day);
    }

    /*
     * Returns the number of days
     * from the beginning of year
     */
    static int days() {
        int sumOfDays = day;
        int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 1; i < month; i++) {
            sumOfDays += daysInMonths[i - 1];
        }

        return sumOfDays;
    }
    /*
     * Returns month name
     */

     static String monthName() {
        String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        return months[month - 1];
     }
    

    public static void main(String[] args) {
        System.out.println("Date: " + myDate());
        System.out.println("Days from the beginning of the year: " + days());
        System.out.println("Month name: " + monthName());
    }

}
