//package com.alexey;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestStudentDaoImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2",
//                "control", 1);
//        StudentDaoImpl.getInstance().create(student, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        StudentDaoImpl.getInstance().create(student, session);
//        Assertions.assertEquals("User{id=1, firstName='Bob', lastName='Bobovich'," +
//                        " email='Bob@gmail.com', password='111w2'}",
//                StudentDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student1 = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        StudentDaoImpl.getInstance().create(student1, session);
//        Student student2 = StudentDaoImpl.getInstance().readById(1, session);
//        student2.setFirstName("Hobbit");
//        student2.setLastName("Hobbitovich");
//        student2.setEmail("Hob@gmail.com");
//        student2.setPassword("HHH");
//        student2.setPermission("control");
//        student2.setUserId(1);
//        StudentDaoImpl.getInstance().update(student2, session);
//        Assertions.assertEquals("User{id=1, firstName='Hobbit', lastName='Hobbitovich'," +
//                " email='Hob@gmail.com', password='HHH'}",
//                StudentDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        StudentDaoImpl.getInstance().create(student, session);
//        StudentDaoImpl.getInstance().delete(student, session);
//        Assertions.assertEquals(null, StudentDaoImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        StudentDaoImpl instance = StudentDaoImpl.getInstance();
//        Assertions.assertEquals(instance, StudentDaoImpl.getInstance());
//    }
//}
