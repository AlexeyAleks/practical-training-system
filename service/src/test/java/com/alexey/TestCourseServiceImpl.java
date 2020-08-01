package com.alexey;

import com.alexey.service.impl.CourseServiceImpl;
import com.alexey.service.impl.GroupServiceImpl;
import com.alexey.entity.Course;
import com.alexey.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCourseServiceImpl {
    @Test
    public void testCreate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Group group = new Group("group 001");
        GroupServiceImpl.getInstance().create(group, session);
        Course course = new Course("Java Basics", 1);
        CourseServiceImpl.getInstance().create(course, session);
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
        Assertions.assertEquals("Course{id=1, name='Java Basics', groupId=1}",
                CourseServiceImpl.getInstance().readById(1, session).toString());
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
        Course course2 = CourseServiceImpl.getInstance().readById(1, session);
        course2.setName("Hobbit");
        CourseServiceImpl.getInstance().update(course2, session);
        Assertions.assertEquals("Course{id=1, name='Hobbit', groupId=1}",
                CourseServiceImpl.getInstance().readById(1, session).toString());
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
        CourseServiceImpl.getInstance().delete(course, session);
        Assertions.assertEquals(null, CourseServiceImpl.getInstance().readById(1, session));
        session.close();
    }

    @Test
    public void testGetInstance() {
        CourseServiceImpl instance = CourseServiceImpl.getInstance();
        Assertions.assertEquals(instance, CourseServiceImpl.getInstance());
    }
}
