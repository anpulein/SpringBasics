package org.example.hibernate_test;

import org.example.hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DELETE {
    public static void main(String[] args) {
        // Создание сессии
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml") // Чтобы сессия могла прочиать файл конфигурации
                .addAnnotatedClass(Employee.class) // Тот, класс который имеет аннотации для работы с БД
                .buildSessionFactory(); // Для переиспользования

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);

            session.createQuery("delete Employee where name = 'Aleksandr'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
