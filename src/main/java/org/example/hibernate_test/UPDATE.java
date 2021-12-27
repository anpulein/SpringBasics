package org.example.hibernate_test;

import org.example.hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UPDATE {
    public static void main(String[] args) {
        // Создание сессии
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml") // Чтобы сессия могла прочиать файл конфигурации
                .addAnnotatedClass(Employee.class) // Тот, класс который имеет аннотации для работы с БД
                .buildSessionFactory(); // Для переиспользования

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);

            session.createQuery("update Employee set salary=1000 " +
                    "where name = 'Aleksandr'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}
