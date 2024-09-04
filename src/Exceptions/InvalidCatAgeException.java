package Exceptions;

public class InvalidCatAgeException extends RuntimeException{
    public InvalidCatAgeException(String message) {
        super(message);
    }
}
