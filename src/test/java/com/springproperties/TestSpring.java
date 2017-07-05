package com.springproperties;

import com.springProperties.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

/**
 * Created by hemantojha on 05/07/17.
 */
public class TestSpring {

    @Test
    public void testSpring(){

        Resource resource = new ClassPathResource("applicationContext.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        Student student = (Student)factory.getBean("studentbean");

        System.out.println(student.toString());

    }
}
