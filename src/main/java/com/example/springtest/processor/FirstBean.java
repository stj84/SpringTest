package com.example.springtest.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class FirstBean implements InitializingBean {

   // 无参构造函数进行默认实例化
   public FirstBean(){
      System.out.println("Bean实例化 构造方法！"+ this);
   }

   // 实例创建后自动进行初始化动作
   @PostConstruct
   public void init(){
      System.out.println(this+"执行FirstBean的PostConstruct");
   }

   // 实例初始化结束后执行
   @Override
   public void afterPropertiesSet() throws Exception {
      System.out.println(this+"执行FirstBean的afterPropertiesSet");
   }
}
