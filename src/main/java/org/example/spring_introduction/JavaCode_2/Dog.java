package org.example.spring_introduction.JavaCode_2;

import org.example.spring_introduction.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
}
