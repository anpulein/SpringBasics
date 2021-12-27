package org.example.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.aop.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("loggAspectBean")
@Aspect // Это класс, отвечающий за сквозную функциональность
@Order(10) // Порядок выполнения - 1
public class LoggingAspect {


    @Before("org.example.aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) { // Получаем информацию о сигнатуре и параметрах этого метода

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodeSignature = " + methodSignature);
        System.out.println("methodeSignature.getMethode() = " + methodSignature.getMethod());
        System.out.println("methodeSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodeSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + ", " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYersOfPublication());
                }
                else if(obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------------------------------------");
    }


//    @Pointcut("execution(* org.example.aop.UntilLibrary.*(..))")
//    private void allMethodsFromUntilLibrary() {}
//
//    @Pointcut("execution(public void org.example.aop.UntilLibrary.returnMagazine())")
//    private void returnMagazineMethodsFromUntilLibrary() {}
//
//    @Pointcut("allMethodsFromUntilLibrary() && !returnMagazineMethodsFromUntilLibrary()")
//    private void allMethodsExceptReturnMagazineFromLibrary(){}
//
//
//    @Before("allMethodsExceptReturnMagazineFromLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }


//    @Pointcut("execution(* org.example.aop.UntilLibrary.get*())")
//    private void allGetMethodsFromUntilLibrary(){}
//
//    @Pointcut("execution(* org.example.aop.UntilLibrary.return*())")
//    private void allReturnMethodsFromUntilLibrary(){}
//
//    @Pointcut("allGetMethodsFromUntilLibrary() || allReturnMethodsFromUntilLibrary()")
//    private void allGetAndReturnMethodsFromUntilLibrary(){}
//
//
//    @Before("allGetMethodsFromUntilLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUntilLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUntilLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

//    @Before("execution(public void org.example.aop.UntilLibrary.getBook())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
//
//    @Before("execution(public String returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }

//    @Before("execution(public void getBook(*))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

//    @Before("execution(public void getBook(..))")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }

//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }
}
