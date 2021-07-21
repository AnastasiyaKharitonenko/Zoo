package com;

public class OutOfAviaryCapacityException extends Exception{
    public OutOfAviaryCapacityException() {
    }

    public OutOfAviaryCapacityException(String message) {
        super(message);
    }

    public OutOfAviaryCapacityException(String message, Throwable cause) {
        super(message, cause);
    }


    public OutOfAviaryCapacityException(Throwable cause) {
        super(cause);
    }

    public OutOfAviaryCapacityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
