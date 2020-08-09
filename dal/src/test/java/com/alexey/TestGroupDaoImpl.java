//package com.alexey;
//
//import com.alexey.dal.dao.impl.GroupDaoImpl;
//import com.alexey.dal.entity.Group;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestGroupDaoImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        Assertions.assertEquals("Group{id=1, name='group 001'}",
//                GroupDaoImpl.getInstance().readById(1, session).toString());
//        System.out.println(group.toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group1 = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group1, session);
//        Group group2 = GroupDaoImpl.getInstance().readById(1, session);
//        group2.setName("111");
//        GroupDaoImpl.getInstance().update(group2, session);
//        Assertions.assertEquals("Group{id=1, name='111'}",
//                GroupDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        GroupDaoImpl.getInstance().delete(group, session);
//        Assertions.assertEquals(null, GroupDaoImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        GroupDaoImpl instance = GroupDaoImpl.getInstance();
//        Assertions.assertEquals(instance, GroupDaoImpl.getInstance());
//    }
//}
