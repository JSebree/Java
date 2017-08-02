/**
 * Created by Mavericks on 7/9/17.
 */
public class BadArrayException extends Exception{
    public BadArrayException() {
        super();
    }

    /** A default constructor with no arguments.
     */
    public BadArrayException(String message){
        super(message);
    }

    /**
     * A constructor taking a String parameter (the exception message). The  message parameter must be passed to the parent Exception(String) constructor.
     */
}
