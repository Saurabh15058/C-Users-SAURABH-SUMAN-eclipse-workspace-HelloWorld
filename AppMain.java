package com.websystique.spring.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.websystique.spring.domain.HelloWorld;
import com.websystique.spring.domain.HelloWorldImpl;
 
public class AppMain {
 
    public static void main(String args[]) {
       
   
    	BeanFactory context = new XmlBeanFactory (new ClassPathResource("helloworld-config.xml"));// spring container
    	//AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");

     HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
     	
   	//HelloWorld bean=new HelloWorldImpl();
   	
      bean.sayhello(" Saurabh Suman ");
     
   //context.close();
        
        
        
       
    }
 
}






//BeanFactory context = new XmlBeanFactory (new ClassPathResource("helloworld-config.xml"));// spring container
//	  HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
	//     bean.sayHello(" Kedar ");
