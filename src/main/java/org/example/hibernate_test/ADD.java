package org.example.hibernate_test;

import org.example.hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ADD {
    public static void main(String[] args) {
        // Создание сессии
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml") // Чтобы сессия могла прочиать файл конфигурации
                .addAnnotatedClass(Employee.class) // Тот, класс который имеет аннотации для работы с БД
                .buildSessionFactory(); // Для переиспользования

        try {
            Session session = factory.getCurrentSession(); // Подключение к БД
            Employee emp = new Employee("Aleksandr", "Smirnov", "IT", 600);
            session.beginTransaction(); // Открыть транзакцию
            session.save(emp); // Добавляем объект в БД
            session.getTransaction().commit(); // Закрыть транзакцию

            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}
