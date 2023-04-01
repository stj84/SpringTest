package com.example.springtest;

import com.example.springtest.aware.Config;
import com.example.springtest.aware.Config2;
import com.example.springtest.aware.MyBeanName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class SpringTestApplicationTests {

    @Test
    void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        MyBeanName myBeanName = context.getBean(MyBeanName.class);
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.springtest.processor");

        }

}
