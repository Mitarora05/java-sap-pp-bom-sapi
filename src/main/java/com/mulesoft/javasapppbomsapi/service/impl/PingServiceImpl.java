package com.mulesoft.javasapppbomsapi.service.impl;

import com.mulesoft.javasapppbomsapi.exception.ServiceCustomException;
import com.mulesoft.javasapppbomsapi.model.CustomResponseObject;
import com.mulesoft.javasapppbomsapi.service.PingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PingServiceImpl implements PingService {

    private final RestTemplate restTemplate;

    public PingServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<CustomResponseObject> getPing() throws ServiceCustomException {
        try {
            log.info("Ping Flow has been triggered");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<CustomResponseObject> response = restTemplate.getForEntity("URL", CustomResponseObject.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                log.info("Ping Flow has ended");
                return response;
            } else {
                throw new ServiceCustomException("Error in Ping Flow");
            }
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }
}