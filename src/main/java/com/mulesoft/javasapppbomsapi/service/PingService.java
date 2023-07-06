package com.mulesoft.javasapppbomsapi.service;

import com.mulesoft.javasapppbomsapi.exception.ServiceCustomException;

public interface PingService {

    // getPingImplSub_Flow
    Object getPing() throws ServiceCustomException;
}