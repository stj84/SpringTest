package com.example.springtest.aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( Config.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( new Class[]{Config.class,Config2.class,Config3.class});

        MyBeanName myBeanName1 = ((MyBeanName) context.getBean("myCustomBeanName"));
        System.out.println("1 bean ===== "+myBeanName1+"  ==| ==  "+myBeanName1.getMyBeanName());

        MyBeanName myBeanName2 = ((MyBeanName) context.getBean("myCustomBeanName2"));
        System.out.println("2 bean ===== "+myBeanName2+"  ==| ==  "+myBeanName2.getMyBeanName());

        MyBeanName myBeanName3 = ((MyBeanName) context.getBean("myCustomBeanName3"));
        System.out.println("3 bean ===== "+myBeanName3+"  ==| ==  "+myBeanName3.getMyBeanName());


    }
}
