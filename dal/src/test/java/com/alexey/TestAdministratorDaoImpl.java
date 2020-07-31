package com.alexey;

import com.alexey.dao.impl.AdministratorDaoImpl;
import com.alexey.dao.impl.CourseDaoImpl;
import com.alexey.entity.Administrator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAdministratorDaoImpl {
    @Test
    public void testCreate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Administrator administrator = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
                "111w2",
                "control", 1);
        AdministratorDaoImpl.getInstance().create(administrator, session);
        session.close();
    }

    @Test
    public void testRead() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Administrator administrator = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
                "111w2","control", 1);
        AdministratorDaoImpl.getInstance().create(administrator, session);
        Assertions.assertEquals("User{id=1, firstName='Bob', lastName='Bobovich'," +
                        " email='Bob@gmail.com', password='111w2'}",
                AdministratorDaoImpl.getInstance().readById(1, session).toString());
        session.close();
    }

    @Test
    public void testUpdate() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Administrator administrator1 = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
                "111w2","control", 1);
        AdministratorDaoImpl.getInstance().create(administrator1, session);
        Administrator administrator2 = AdministratorDaoImpl.getInstance().readById(1, session);
        administrator2.setFirstName("Hobbit");
        administrator2.setLastName("Hobbitovich");
        administrator2.setEmail("Hob@gmail.com");
        administrator2.setPassword("HHH");
        administrator2.setPermission("control");
        administrator2.setUserId(1);
        AdministratorDaoImpl.getInstance().update(administrator2, session);
        Assertions.assertEquals("User{id=1, firstName='Hobbit', lastName='Hobbitovich'," +
                " email='Hob@gmail.com', password='HHH'}",
                AdministratorDaoImpl.getInstance().readById(1, session).toString());
        session.close();
    }

    @Test
    public void testDelete() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Administrator administrator = new Administrator("Bob", "Bobovich", "Bob@gmail.com",
                "111w2","control", 1);
        AdministratorDaoImpl.getInstance().create(administrator, session);
        AdministratorDaoImpl.getInstance().delete(administrator, session);
        Assertions.assertEquals(null, AdministratorDaoImpl.getInstance().readById(1, session));
        session.close();
    }

    @Test
    public void testGetInstance() {
        CourseDaoImpl INSTANCE = null;
        AdministratorDaoImpl instance = AdministratorDaoImpl.getInstance();
        Assertions.assertEquals(instance, AdministratorDaoImpl.getInstance());
    }
}
