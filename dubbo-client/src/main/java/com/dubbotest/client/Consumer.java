package com.dubbotest.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbotest.service.ITestService;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @Reference
    ITestService service;

    public void clientOperation() {
        System.out.println(service.getClass());
        System.out.println(service.getHash("dubboTest"));
    }

}
