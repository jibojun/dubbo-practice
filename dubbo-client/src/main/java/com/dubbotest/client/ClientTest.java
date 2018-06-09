package com.dubbotest.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-context-client.xml");
        ((ClassPathXmlApplicationContext) context).start();
        Consumer consumer=(Consumer)context.getBean("consumer");
        consumer.clientOperation();
    }
}
