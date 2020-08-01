package com.alexey;

import com.alexey.service.impl.CourseServiceImpl;
import com.alexey.service.impl.GroupServiceImpl;
import com.alexey.service.impl.TopicServiceImpl;
import com.alexey.entity.Course;
import com.alexey.entity.Group;
import com.alexey.entity.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTopicServiceImpl {
    @Test
    public void testCreate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Group group = new Group("group 001");
        GroupServiceImpl.getInstance().create(group, session);
        Course course = new Course("Java Basics", 1);
        CourseServiceImpl.getInstance().create(course, session);
        Topic topic = new Topic("Methods", "...", 1);
        TopicServiceImpl.getInstance().create(topic, session);
        session.close();
    }

    @Test
    public void testRead() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Group group = new Group("group 001");
        GroupServiceImpl.getInstance().create(group, session);
        Course course = new Course("Java Basics", 1);
        CourseServiceImpl.getInstance().create(course, session);
        Topic administrator = new Topic("Methods", "...", 1);
        TopicServiceImpl.getInstance().create(administrator, session);
        Assertions.assertEquals("Topic{id=1, name='Methods', content='...', courseId=1}",
                TopicServiceImpl.getInstance().readById(1, session).toString());
        session.close();
    }

    @Test
    public void testUpdate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Group group = new Group("group 001");
        GroupServiceImpl.getInstance().create(group, session);
        Course course = new Course("Java Basics", 1);
        CourseServiceImpl.getInstance().create(course, session);
        Topic administrator1 = new Topic("Methods", "...", 1);
        TopicServiceImpl.getInstance().create(administrator1, session);
        Topic course2 = TopicServiceImpl.getInstance().readById(1, session);
        course2.setName("Hobbit");
        course2.setContent("zxzxzxzxzxzx");
        TopicServiceImpl.getInstance().update(course2, session);
        Assertions.assertEquals("Topic{id=1, name='Hobbit', content='zxzxzxzxzxzx', courseId=1}",
                TopicServiceImpl.getInstance().readById(1, session).toString());
        session.close();
    }

    @Test
    public void testDelete() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Group group = new Group("group 001");
        GroupServiceImpl.getInstance().create(group, session);
        Course course = new Course("Java Basics", 1);
        CourseServiceImpl.getInstance().create(course, session);
        Topic administrator = new Topic("Methods", "...", 1);
        TopicServiceImpl.getInstance().create(administrator, session);
        TopicServiceImpl.getInstance().delete(administrator, session);
        Assertions.assertEquals(null, TopicServiceImpl.getInstance().readById(1, session));
        session.close();
    }

    @Test
    public void testGetInstance() {
        TopicServiceImpl instance = TopicServiceImpl.getInstance();
        Assertions.assertEquals(instance, TopicServiceImpl.getInstance());
    }
}
