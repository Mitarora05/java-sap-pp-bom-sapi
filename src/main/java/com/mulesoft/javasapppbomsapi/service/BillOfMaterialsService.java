package com.mulesoft.javasapppbomsapi.service;

import com.mulesoft.javasapppbomsapi.exception.ServiceCustomException;
import com.mulesoft.javasapppbomsapi.model.GetBillOfMaterial;
import com.mulesoft.javasapppbomsapi.model.PostBillOfMaterialRequest;
import com.mulesoft.javasapppbomsapi.model.PostBillOfMaterialResponse;
import java.util.List;

public interface BillOfMaterialsService {

    // getBillOfMaterialsImplSub_Flow
    List<GetBillOfMaterial> getBillOfMaterials() throws ServiceCustomException;

    // postBillOfMaterialsImplSub_Flow
    PostBillOfMaterialResponse createBillOfMaterials(PostBillOfMaterialRequest request) throws ServiceCustomException;
}