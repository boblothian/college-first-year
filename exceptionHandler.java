/**
 * Robert Lothian
 * 1/4/21
 * This class is to create a generic exception handler that  will trigger if invalid data is entered and will have a custom message
 */

public class exceptionHandler extends Exception
{
    public exceptionHandler(String message)
        {
            super (message);//creates new exception with customisable error message
        }

}
