package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("sels");
       System.out.println("deepika");
       System.out.println("aSHOK");
       String temp="mik";
       String new1="India"+temp;
       System.out.println(new1);
    }

}
