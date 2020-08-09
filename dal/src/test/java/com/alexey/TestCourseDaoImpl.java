//package com.alexey;
//
//import com.alexey.dal.dao.impl.CourseDaoImpl;
//import com.alexey.dal.dao.impl.GroupDaoImpl;
//import com.alexey.dal.entity.Course;
//import com.alexey.dal.entity.Group;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestCourseDaoImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        Course course = new Course("Java Basics", 1);
//        CourseDaoImpl.getInstance().create(course, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        Course course = new Course("Java Basics", 1);
//        CourseDaoImpl.getInstance().create(course, session);
//        Assertions.assertEquals("Course{id=1, name='Java Basics', groupId=1}",
//                CourseDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        Course course = new Course("Java Basics", 1);
//        CourseDaoImpl.getInstance().create(course, session);
//        Course course2 = CourseDaoImpl.getInstance().readById(1, session);
//        course2.setName("Hobbit");
//        CourseDaoImpl.getInstance().update(course2, session);
//        Assertions.assertEquals("Course{id=1, name='Hobbit', groupId=1}",
//                CourseDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        Course course = new Course("Java Basics", 1);
//        CourseDaoImpl.getInstance().create(course, session);
//        CourseDaoImpl.getInstance().delete(course, session);
//        Assertions.assertEquals(null, CourseDaoImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        CourseDaoImpl instance = CourseDaoImpl.getInstance();
//        Assertions.assertEquals(instance, CourseDaoImpl.getInstance());
//    }
//}
