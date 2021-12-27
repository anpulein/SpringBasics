package org.example.hibernate_test;

import org.example.hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GET2 {
    public static void main(String[] args) {
        // Создание сессии
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml") // Чтобы сессия могла прочиать файл конфигурации
                .addAnnotatedClass(Employee.class) // Тот, класс который имеет аннотации для работы с БД
                .buildSessionFactory(); // Для переиспользования

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee")
//                            .getResultList(); // Получаем всех работников

            List<Employee> emps = session.createQuery("from Employee " +
                            "where name = 'Aleksandr' AND salary>650")
                            .getResultList(); // Получаем всех работников

            for (Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();


            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}
