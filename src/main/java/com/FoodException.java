package com;

public class FoodException  extends Exception {
    public FoodException() {
    }
    public FoodException(String message) {
        super(message);
    }

    public FoodException(String message, Throwable cause) {
        super(message, cause);
    }

    public FoodException(Throwable cause) {
        super(cause);
    }

    public FoodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
