package com.alexey;

import com.alexey.dao.impl.*;
import com.alexey.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StarterApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Administrator administrator = new Administrator("Admin", "Adminovich", "hell@gmail.com",
                "U43hd2fkdd", "control", 1);
        AdministratorDaoImpl.getInstance().create(administrator, session);

        Teacher teacher1 = new Teacher("Albert", "Einstein", "einstein@gmail.com",
                "01001001", "distribution", 2);
        Teacher teacher2 = new Teacher("Maria", "Curie", "curie@gmail.com",
                "ewfwwwwssdDD", "teaching", 3);
        TeacherDaoImpl.getInstance().create(teacher1, session);
        TeacherDaoImpl.getInstance().create(teacher2, session);

        Student student1 = new Student("Ivan", "Ivanovich", "ivan@gmail.com",
                "iv378vi", "study", 4);
        Student student2 = new Student("Petrov", "Petrovich", "petr@gmail.com",
                "pe935pe", "study", 5);
        Student student3 = new Student("Alesya", "Alesyanovich", "ales@gmail.com",
                "al735la", "study", 6);
        Student student4 = new Student("Rick", "Rickovich", "rick@gmail.com",
                "ri163ri", "study", 7);
        StudentDaoImpl.getInstance().create(student1, session);
        StudentDaoImpl.getInstance().create(student2, session);
        StudentDaoImpl.getInstance().create(student3, session);
        StudentDaoImpl.getInstance().create(student4, session);

        Group group1 = new Group("gr001");
        Group group2 = new Group("gr002");
//        GroupDaoImpl.getInstance().create(group1, session);
//        GroupDaoImpl.getInstance().create(group2, session);



//        User foundUser1 = UserDaoImpl.getInstance().readById(1, session);
//        Object foundUser2 = UserDaoImpl.getInstance().readById(2, session);
//        System.out.println(foundUser1);
//        System.out.println(foundUser2);
//
//        foundUser1.setFirstName("Rob");
//        foundUser1.setLastName("Robokovich");
//        foundUser1.setEmail("Rob@gmail.com");
//        foundUser1.setPassword("RRRw2");
//        UserDaoImpl.getInstance().update(foundUser1, session);
//        System.out.println(UserDaoImpl.getInstance().readById(1, session));
//
//        UserDaoImpl.getInstance().delete(foundUser1, session);

        session.close();
    }
}
