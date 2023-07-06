package com.mulesoft.javasapppbomsapi.exception;


public class ControllerCustomException extends RuntimeException {

    public ControllerCustomException(String message) {
        super(message);
    }

    public ControllerCustomException(String message,Throwable throwable) {
        super(message,throwable);
    }

    public ControllerCustomException(Throwable throwable) {
        super(throwable);
    }
}
    