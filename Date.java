/**
 * Robert Lothian
 * 1/4/21
 * Date program to practice exception handling
 */

/**
 * This class is to create and hold values for the date
 */
public class Date
{
    private int year, month, day; //to hold values for day, month and year

    public Date (int year, int month, int day) throws exceptionHandler { //set values
        setYear(year);
        setMonth(month);
        setDay(day);
    }
//getters and setters for day, month, year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws exceptionHandler {

        if (month > 0 && month <13) //this is to limit the valid input from 1 to 12 for the months of the year, any other number will cause error

            {
                this.month = month;
            }
        else
        {
            throw new exceptionHandler("This is not a valid month, try again"); //message to inform user has inputted invalid month
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws exceptionHandler {

        if (day > 0 && day <32)//this is to limit the days of the month from 1 to 31, if outside that range will cause error.
                                //could add in here if statements to limit search depending on month entered.
                                //eg. if month == 2 then day>0 && <29. Could even add leap year with functionality in set year.
        {
            this.day = day;
        }
        else
        {
            throw new exceptionHandler("This is not a valid day, try again"); //message if invalid day entered
        }

    }
    public String toString()
    {
        return "The date today is " + day + "/" + month + "/" + year; //concatenation and format to print date
    }
}
