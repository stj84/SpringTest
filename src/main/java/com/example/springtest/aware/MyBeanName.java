package com.example.springtest.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBeanName implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("getApplicationName ==="+applicationContext.getBean("myCustomBeanName2"));
    }

    String strBeanName;
     @Override
     public void setBeanName(String beanName) {
         this.strBeanName = beanName ;
     }

    public String getMyBeanName() {
        return strBeanName;
    }

    private void initBean() {
        this.strBeanName = "443333333333333";
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("classloader==" + classLoader.getClass().getName());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("=================================beanfactory=========================");
        System.out.println("containsBean [myCustomBeanName2] =" + beanFactory.containsBean("myCustomBeanName2"));
        System.out.println("isSingleton  [myCustomBeanName2] =" + beanFactory.isSingleton("myCustomBeanName2"));
        System.out.println(((MyBeanName) beanFactory.getBean("myCustomBeanName3")).getMyBeanName());
    }
}