package exceptions;

/**
 * Exception thrown when user input is unknown.
 */
public class DukeException extends Exception {
    public DukeException (String str) {
        super(str);
    }
}
