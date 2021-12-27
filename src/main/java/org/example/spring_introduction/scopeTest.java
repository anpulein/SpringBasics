package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Переменные ссылкаются на 1 и тот же объект" + (myDog == yourDog));
    }
}
