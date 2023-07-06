package com.mulesoft.javasapppbomsapi.service.impl;

import com.mulesoft.javasapppbomsapi.exception.ServiceCustomException;
import com.mulesoft.javasapppbomsapi.model.GetBillOfMaterial;
import com.mulesoft.javasapppbomsapi.model.PostBillOfMaterialRequest;
import com.mulesoft.javasapppbomsapi.model.PostBillOfMaterialResponse;
import com.mulesoft.javasapppbomsapi.service.BillOfMaterialsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Slf4j
public class BillOfMaterialsServiceImpl implements BillOfMaterialsService {

    private final RestTemplate restTemplate;

    public BillOfMaterialsServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<GetBillOfMaterial> getBillOfMaterials() throws ServiceCustomException {
        try {
            log.info("Before Fetching List Of BOM");
            ResponseEntity<List<GetBillOfMaterial>> response = restTemplate.exchange("URL", HttpMethod.GET, null, new ParameterizedTypeReference<List<GetBillOfMaterial>>() {});
            log.info("After Fetching List Of BOM");
            return response.getBody();
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }

    @Override
    public PostBillOfMaterialResponse createBillOfMaterials(PostBillOfMaterialRequest request) throws ServiceCustomException {
        try {
            log.info("Before Creating BOM");
            HttpEntity<PostBillOfMaterialRequest> entity = new HttpEntity<>(request);
            ResponseEntity<PostBillOfMaterialResponse> response = restTemplate.exchange("URL", HttpMethod.POST, entity, PostBillOfMaterialResponse.class);
            log.info("After Creating BOM");
            return response.getBody();
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }
}