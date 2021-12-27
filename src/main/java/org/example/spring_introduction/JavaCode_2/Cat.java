package org.example.spring_introduction.JavaCode_2;

import org.example.spring_introduction.Pet;
import org.springframework.stereotype.Component;

public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
