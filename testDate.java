/**
 * Robert Lothian
 * 1/4/21
 * Date program to practice exception handling
 */

import java.util.Scanner;

/**
 * this class gets input from the user and then prints out the date,
 */
public class testDate
{
    public static void main (String[] args) throws exceptionHandler {
        Scanner in = new Scanner(System.in);

        System.out.print("You will be asked to enter today's date."+"\n"); //opening message
        System.out.print("Please enter the following values using numbers:"+"\n");

        System.out.println("Please enter the year:"); //get user input
        int year = in.nextInt();

        System.out.println("Please enter the month:"); //get user input
        int month = in.nextInt();

        System.out.println("Please enter the day:"); //get user input
        int day = in.nextInt();

        Date date = new Date(year,month,day); //creates date

        System.out.print(date); //prints out the date in format set by concatenation in Date class
    }

}
