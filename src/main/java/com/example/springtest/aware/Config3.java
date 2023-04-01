package com.example.springtest.aware;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
 public class Config3 {
     @Bean(name = "myCustomBeanName3", initMethod = "initBean")
     public MyBeanName getMyBeanName() {
         return new MyBeanName();
     }
 }