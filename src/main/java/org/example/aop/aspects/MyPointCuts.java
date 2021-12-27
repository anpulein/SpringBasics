package org.example.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* abc*(..))") // Создает ссылку на из данного Pointcut
    public void allAddMethods(){}

}
