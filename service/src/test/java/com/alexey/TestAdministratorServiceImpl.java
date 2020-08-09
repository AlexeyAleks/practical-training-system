//package com.alexey;
//
//import com.alexey.service.impl.AdministratorServiceImpl;
//import com.alexey.service.impl.CourseServiceImpl;
//import com.alexey.dal.entity.Administrator;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestAdministratorServiceImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Administrator administrator = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2",
//                "control", 1);
//        AdministratorServiceImpl.getInstance().create(administrator, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Administrator administrator = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        AdministratorServiceImpl.getInstance().create(administrator, session);
//        Assertions.assertEquals("User{id=1, firstName='Bob', lastName='Bobovich'," +
//                        " email='Bob@gmail.com', password='111w2'}",
//                AdministratorServiceImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Administrator administrator1 = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        AdministratorServiceImpl.getInstance().create(administrator1, session);
//        Administrator administrator2 = AdministratorServiceImpl.getInstance().readById(1, session);
//        administrator2.setFirstName("Hobbit");
//        administrator2.setLastName("Hobbitovich");
//        administrator2.setEmail("Hob@gmail.com");
//        administrator2.setPassword("HHH");
//        administrator2.setPermission("control");
//        administrator2.setUserId(1);
//        AdministratorServiceImpl.getInstance().update(administrator2, session);
//        Assertions.assertEquals("User{id=1, firstName='Hobbit', lastName='Hobbitovich'," +
//                " email='Hob@gmail.com', password='HHH'}",
//                AdministratorServiceImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Administrator administrator = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
//                "111w2","control", 1);
//        AdministratorServiceImpl.getInstance().create(administrator, session);
//        AdministratorServiceImpl.getInstance().delete(administrator, session);
//        Assertions.assertEquals(null, AdministratorServiceImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        CourseServiceImpl INSTANCE = null;
//        AdministratorServiceImpl instance = AdministratorServiceImpl.getInstance();
//        Assertions.assertEquals(instance, AdministratorServiceImpl.getInstance());
//    }
//}
