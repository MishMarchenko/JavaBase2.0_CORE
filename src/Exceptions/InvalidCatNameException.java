package Exceptions;

public class InvalidCatNameException extends RuntimeException{
    public InvalidCatNameException(String message){
        super(message);
    }
}
