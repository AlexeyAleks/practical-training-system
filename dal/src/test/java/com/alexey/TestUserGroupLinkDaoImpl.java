//package com.alexey;
//
//import com.alexey.dal.dao.impl.GroupDaoImpl;
//import com.alexey.dal.dao.impl.UserDaoImpl;
//import com.alexey.dal.entity.Group;
//import com.alexey.dal.entity.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestUserGroupLinkDaoImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        UserGroupLink userGroupLink = new UserGroupLink(1, 1);
//        UserGroupLinkDaoImpl.getInstance().create(userGroupLink, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        UserGroupLink userGroupLink = new UserGroupLink(1, 1);
//        UserGroupLinkDaoImpl.getInstance().create(userGroupLink, session);
//        Assertions.assertEquals("UserGroupLink{id=1, userId=1, groupId=1}",
//                UserGroupLinkDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        User user2 = new User("Bob2", "Bobovich2", "Bob2@gmail.com", "222w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        UserDaoImpl.getInstance().create(user2, session);
//        Group group1 = new Group("group 001");
//        Group group2 = new Group("group 002");
//        GroupDaoImpl.getInstance().create(group1, session);
//        GroupDaoImpl.getInstance().create(group2, session);
//        UserGroupLink userGroupLink1 = new UserGroupLink(1, 1);
//        UserGroupLinkDaoImpl.getInstance().create(userGroupLink1, session);
//        UserGroupLink userGroupLink2 = UserGroupLinkDaoImpl.getInstance().readById(1, session);
//        userGroupLink2.setUserId(2);
//        userGroupLink2.setGroupId(2);
//        UserGroupLinkDaoImpl.getInstance().update(userGroupLink2, session);
//        Assertions.assertEquals("UserGroupLink{id=1, userId=2, groupId=2}",
//                UserGroupLinkDaoImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserDaoImpl.getInstance().create(user1, session);
//        Group group = new Group("group 001");
//        GroupDaoImpl.getInstance().create(group, session);
//        UserGroupLink userGroupLink = new UserGroupLink(1, 1);
//        UserGroupLinkDaoImpl.getInstance().create(userGroupLink, session);
//        UserGroupLinkDaoImpl.getInstance().delete(userGroupLink, session);
//        Assertions.assertEquals(null, UserGroupLinkDaoImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        UserGroupLinkDaoImpl instance = UserGroupLinkDaoImpl.getInstance();
//        Assertions.assertEquals(instance, UserGroupLinkDaoImpl.getInstance());
//    }
//}
