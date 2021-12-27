package org.example.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("unLibraryBean")
public class UntilLibrary extends AbstractLibrary {
    @Value("Преступление и наказание")
    private String bookName;

    public void getBook() {
        System.out.println("Мы берем книгу из UntilLibrary " + bookName);
        System.out.println("----------------------------------------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книгу в UntilLibrary");
        return "Война и мир";

    }


    public void getMagazine() {
        System.out.println("Мы берем журнал из UntilLibrary");
        System.out.println("----------------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UntilLibrary ");
        System.out.println("----------------------------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UntilLibrary");
        System.out.println("----------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UntilLibrary");
        System.out.println("----------------------------------------------------------------");
    }


}
