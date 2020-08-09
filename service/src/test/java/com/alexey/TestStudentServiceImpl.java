//package com.alexey;
//
//import com.alexey.service.impl.StudentServiceImpl;
//import com.alexey.dal.entity.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestStudentServiceImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2",
//                "control", 1);
//        StudentServiceImpl.getInstance().create(student, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        StudentServiceImpl.getInstance().create(student, session);
//        Assertions.assertEquals("User{id=1, firstName='Bob', lastName='Bobovich'," +
//                        " email='Bob@gmail.com', password='111w2'}",
//                StudentServiceImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student1 = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        StudentServiceImpl.getInstance().create(student1, session);
//        Student student2 = StudentServiceImpl.getInstance().readById(1, session);
//        student2.setFirstName("Hobbit");
//        student2.setLastName("Hobbitovich");
//        student2.setEmail("Hob@gmail.com");
//        student2.setPassword("HHH");
//        student2.setPermission("control");
//        student2.setUserId(1);
//        StudentServiceImpl.getInstance().update(student2, session);
//        Assertions.assertEquals("User{id=1, firstName='Hobbit', lastName='Hobbitovich'," +
//                " email='Hob@gmail.com', password='HHH'}",
//                StudentServiceImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Student student = new Student("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        StudentServiceImpl.getInstance().create(student, session);
//        StudentServiceImpl.getInstance().delete(student, session);
//        Assertions.assertEquals(null, StudentServiceImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        StudentServiceImpl instance = StudentServiceImpl.getInstance();
//        Assertions.assertEquals(instance, StudentServiceImpl.getInstance());
//    }
//}
