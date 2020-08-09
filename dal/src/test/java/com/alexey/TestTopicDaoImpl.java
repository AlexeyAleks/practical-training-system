//package com.alexey;
//
//import com.alexey.dal.dao.impl.CourseDaoImpl;
//import com.alexey.dal.dao.impl.GroupDaoImpl;
//import com.alexey.dal.dao.impl.TopicDaoImpl;
//import com.alexey.dal.entity.Course;
//import com.alexey.dal.entity.Group;
//import com.alexey.dal.entity.Topic;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestTopicDaoImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        Course course = new Course("Java Basics", 1);
//        CourseDaoImpl.getInstance().create(course, session);
//        Topic topic = new Topic("Methods", "...", 1);
//        TopicDaoImpl.getInstance().create(topic, session);
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
//        Topic administrator = new Topic("Methods", "...", 1);
//        TopicDaoImpl.getInstance().create(administrator, session);
//        Assertions.assertEquals("Topic{id=1, name='Methods', content='...', courseId=1}",
//                TopicDaoImpl.getInstance().readById(1, session).toString());
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
//        Topic administrator1 = new Topic("Methods", "...", 1);
//        TopicDaoImpl.getInstance().create(administrator1, session);
//        Topic course2 = TopicDaoImpl.getInstance().readById(1, session);
//        course2.setName("Hobbit");
//        course2.setContent("zxzxzxzxzxzx");
//        TopicDaoImpl.getInstance().update(course2, session);
//        Assertions.assertEquals("Topic{id=1, name='Hobbit', content='zxzxzxzxzxzx', courseId=1}",
//                TopicDaoImpl.getInstance().readById(1, session).toString());
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
//        Topic administrator = new Topic("Methods", "...", 1);
//        TopicDaoImpl.getInstance().create(administrator, session);
//        TopicDaoImpl.getInstance().delete(administrator, session);
//        Assertions.assertEquals(null, TopicDaoImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        TopicDaoImpl instance = TopicDaoImpl.getInstance();
//        Assertions.assertEquals(instance, TopicDaoImpl.getInstance());
//    }
//}
