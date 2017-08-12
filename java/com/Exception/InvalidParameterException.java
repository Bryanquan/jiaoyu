package com.Exception;

/**
 * the exception for invalidParameterOperation
 */
public class InvalidParameterException extends RuntimeException{

    public  InvalidParameterException() {
        super();
    }

    public InvalidParameterException(String message){
        super(message);
    }

    public InvalidParameterException(String message, Throwable cause) {
        super(message, cause);
    }
}
