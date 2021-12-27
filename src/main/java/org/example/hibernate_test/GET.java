package org.example.hibernate_test;

import org.example.hibernate_test.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GET {
    public static void main(String[] args) {
        // Создание сессии
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml") // Чтобы сессия могла прочиать файл конфигурации
                .addAnnotatedClass(Employee.class) // Тот, класс который имеет аннотации для работы с БД
                .buildSessionFactory(); // Для переиспользования

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleg", "Sidorov", "HR", 700);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            // GET
            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId); // Получаем работника по Id
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}
