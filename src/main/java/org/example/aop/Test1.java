package org.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UntilLibrary unlibrary = context.getBean("unLibraryBean", UntilLibrary.class);
        Book book = context.getBean("book", Book.class);
        unlibrary.getBook();
        unlibrary.addBook("Dima", book);
        unlibrary.addMagazine();
//        unlibrary.getMagazine();

//        SchoolLibrary scLibrary = context.getBean("scLibraryBean", SchoolLibrary.class);
//        scLibrary.getBook();
//        scLibrary.returnBook();

        context.close();
    }
}
