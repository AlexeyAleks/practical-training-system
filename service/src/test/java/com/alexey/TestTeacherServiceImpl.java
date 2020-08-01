package com.alexey;

import com.alexey.service.impl.TeacherServiceImpl;
import com.alexey.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTeacherServiceImpl {
    @Test
    public void testCreate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Teacher teacher = new Teacher("Bob", "Bobovich", "Bob@gmail.com",
                "111w2",
                "control", 1);
        TeacherServiceImpl.getInstance().create(teacher, session);
        session.close();
    }

    @Test
    public void testRead() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Teacher teacher = new Teacher("Bob", "Bobovich", "Bob@gmail.com",
                "111w2","control", 1);
        TeacherServiceImpl.getInstance().create(teacher, session);
        Assertions.assertEquals("User{id=1, firstName='Bob', lastName='Bobovich'," +
                        " email='Bob@gmail.com', password='111w2'}",
                TeacherServiceImpl.getInstance().readById(1, session).toString());
        session.close();
    }

    @Test
    public void testUpdate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Teacher teacher1 = new Teacher("Bob", "Bobovich", "Bob@gmail.com",
                "111w2","control", 1);
        TeacherServiceImpl.getInstance().create(teacher1, session);
        Teacher teacher2 = TeacherServiceImpl.getInstance().readById(1, session);
        teacher2.setFirstName("Hobbit");
        teacher2.setLastName("Hobbitovich");
        teacher2.setEmail("Hob@gmail.com");
        teacher2.setPassword("HHH");
        teacher2.setPermission("control");
        teacher2.setUserId(1);
        TeacherServiceImpl.getInstance().update(teacher2, session);
        Assertions.assertEquals("User{id=1, firstName='Hobbit', lastName='Hobbitovich'," +
                " email='Hob@gmail.com', password='HHH'}",
                TeacherServiceImpl.getInstance().readById(1, session).toString());
        session.close();
    }

    @Test
    public void testDelete() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Teacher teacher = new Teacher("Bob", "Bobovich", "Bob@gmail.com", "111w2",
                "control", 1);
        TeacherServiceImpl.getInstance().create(teacher, session);
        TeacherServiceImpl.getInstance().delete(teacher, session);
        Assertions.assertEquals(null, TeacherServiceImpl.getInstance().readById(1, session));
        session.close();
    }

    @Test
    public void testGetInstance() {
        TeacherServiceImpl instance = TeacherServiceImpl.getInstance();
        Assertions.assertEquals(instance, TeacherServiceImpl.getInstance());
    }
}
