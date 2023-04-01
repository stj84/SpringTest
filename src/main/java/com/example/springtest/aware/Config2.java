package com.example.springtest.aware;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
 public class Config2 {
     @Bean(name = "myCustomBeanName2")
     public MyBeanName getMyBeanName() {
         return new MyBeanName();
     }
 }