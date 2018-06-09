package com.dubbotest.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ServiceStarter {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        ((ClassPathXmlApplicationContext) context).start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
