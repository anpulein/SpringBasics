package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Period;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        person.callYourPet();

        context.close();

    }
}
