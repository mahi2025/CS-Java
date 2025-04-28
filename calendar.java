import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
    purpose: Display calender based on user input
     Steps: 1. import classes calender and Gregoriancalender and scanner for user input
            2. get month and year input from the user 
            3. display calendar for the given month and year
*/

public class calendar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month from 1-12: ");
        int month = input.nextInt() - 1; // Reads the input and subtracts 1 because Java's Calendar class uses 0-based months(0=January, 1=February, etc.)

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        Calendar calendar = new GregorianCalendar(year, month, 1);

        
        System.out.println("\nCalendar for " +"Month: " + getMonthName(month) + " and " + "year: "+  year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

       
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        
        input.close();
    }

    private static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
    }
}