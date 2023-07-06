package com.mulesoft.javasapppbomsapi.exception;


public class ServiceCustomException extends RuntimeException {

    public ServiceCustomException(String message) {
        super(message);
    }

    public ServiceCustomException(String message,Throwable throwable) {
        super(message,throwable);
    }

    public ServiceCustomException(Throwable throwable) {
        super(throwable);
    }
}
    