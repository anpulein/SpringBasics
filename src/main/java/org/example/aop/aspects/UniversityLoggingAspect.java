package org.example.aop.aspects;

import java.util.*;

import org.aspectj.lang.annotation.*;
import org.example.aop.Student;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
                "списка студентов перед методом getStudents");
    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students") // Должен совподать с параметром функции
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение" +
//                "списка студентов после работы метода getStudents");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterTrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterTrowingGetStudentsLoggingAdvice: логируем выброс исключения" + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы метода " +
                "или выброс исключения");
    }
}
