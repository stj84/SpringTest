package com.example.springtest.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//net.postProcessor.CustomerInitialPostProcessor
@Component
public class CustomerInitialPostProcessor implements InstantiationAwareBeanPostProcessor, BeanPostProcessor {

   @PostConstruct
   public void init(){
      System.out.println("执行CustomerInitialPostProcessor的PostConstruct");
   }

   public CustomerInitialPostProcessor(){
      System.out.println("执行CustomerInitialPostProcessor的构造方法");
   }
   // 实例化前   实例化【构造函数】 实例化后
   @Override
   public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
      System.out.println("bean实例化前执行：class为"+beanClass.getName()+"|beanName为"+beanName);
      return null;
   }
   @Override
   public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
      System.out.println("bean实例化后执行：Object为"+bean+"|beanName为"+beanName);
      return false;
   }

   // 初始化前  初始化@postContructs  初始化后
   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
      System.out.println("bean初始化前执行：Object为"+bean+"|beanName为"+beanName);
      return bean;
   }

   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
      System.out.println("bean初始化后执行：Object为"+bean+"|beanName为"+beanName);
      return bean;
   }
}
