package org.example.spring_introduction.JavaCode_2;

import org.example.spring_introduction.Cat;
import org.example.spring_introduction.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.example.spring_introduction")
public class myConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() { // Название класса - это Bean_id
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
