package com.mulesoft.javasapppbomsapi.controller;

import com.mulesoft.javasapppbomsapi.exception.ControllerCustomException;
import com.mulesoft.javasapppbomsapi.exception.ServiceCustomException;
import com.mulesoft.javasapppbomsapi.model.GetBillOfMaterial;
import com.mulesoft.javasapppbomsapi.model.PostBillOfMaterialRequest;
import com.mulesoft.javasapppbomsapi.model.PostBillOfMaterialResponse;
import com.mulesoft.javasapppbomsapi.service.BillOfMaterialsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BillOfMaterialsController {

    @Autowired
    private BillOfMaterialsService billOfMaterialsService;

    @GetMapping("/billofmaterials")
    public ResponseEntity<List<GetBillOfMaterial>> getBillOfMaterials() throws ControllerCustomException {
        try {
            List<GetBillOfMaterial> billOfMaterials = billOfMaterialsService.getBillOfMaterials();
            return new ResponseEntity<>(billOfMaterials, HttpStatus.OK);
        } catch (ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }

    @PostMapping("/billofmaterials")
    public ResponseEntity<PostBillOfMaterialResponse> createBillOfMaterials(@RequestBody PostBillOfMaterialRequest request) throws ControllerCustomException {
        try {
            PostBillOfMaterialResponse response = billOfMaterialsService.createBillOfMaterials(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }
}