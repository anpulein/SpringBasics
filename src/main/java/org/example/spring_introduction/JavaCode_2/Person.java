package org.example.spring_introduction.JavaCode_2;

import org.example.spring_introduction.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

class Person {
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;


//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


//    public void setPet(Pet pet) {
//        System.out.println("Class Person: set Pet");
//        this.pet = pet;
//    }


    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
