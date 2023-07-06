package com.mulesoft.javasapppbomsapi.controller;

import com.mulesoft.javasapppbomsapi.exception.ControllerCustomException;
import com.mulesoft.javasapppbomsapi.exception.ServiceCustomException;
import com.mulesoft.javasapppbomsapi.service.PingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ping")
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping
    public ResponseEntity<String> getPing() throws ControllerCustomException {
        try {
            String message = pingService.getPing();
            return new ResponseEntity<>(message, HttpStatus.OK);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }
}