//package com.alexey;
//
//import com.alexey.dal.dao.impl.UserDaoImpl;
//import com.alexey.dal.entity.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestUserDaoImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        Assertions.assertEquals("User{id=1, firstName='Bob', lastName='Bobovich', email='Bob@gmail.com', " +
//                        "password='111w2'}", UserDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        User user2 = UserDaoImpl.getInstance().readById(1, session);
//        user2.setFirstName("Hobbit");
//        user2.setLastName("Hobbitovich");
//        user2.setEmail("Hob@gmail.com");
//        user2.setPassword("HHH");
//        UserDaoImpl.getInstance().update(user2, session);
//        Assertions.assertEquals("User{id=1, firstName='Hobbit', lastName='Hobbitovich'," +
//                " email='Hob@gmail.com', password='HHH'}",
//                UserDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        UserDaoImpl.getInstance().delete(user1, session);
//        Assertions.assertEquals(null, UserDaoImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        UserDaoImpl instance = UserDaoImpl.getInstance();
//        Assertions.assertEquals(instance, UserDaoImpl.getInstance());
//    }
//}
