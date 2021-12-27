package org.example.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30) // Порядок выполнения - 3
public class ExceptionHandlingAspect {
    @Before("org.example.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем исключения при попытки" +
                "получить книгу/журнал");
        System.out.println("----------------------------------------------------------------");
    }
}
