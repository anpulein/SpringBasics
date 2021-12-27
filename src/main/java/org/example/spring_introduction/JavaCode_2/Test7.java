package org.example.spring_introduction.JavaCode_2;

import org.example.spring_introduction.Person;
import org.example.spring_introduction.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();

        context.close();
    }
}
