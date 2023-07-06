package com.mulesoft.javasapppbomsapi.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler({ ControllerCustomException.class, ServiceCustomException.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ResponseEntity<String> handleGlobalException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.valueOf(getErrorCode(ex)));
    }

    private int getErrorCode(Exception ex) {
        return 500;
    }

}
    