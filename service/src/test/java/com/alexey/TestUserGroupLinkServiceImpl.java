//package com.alexey;
//
//import com.alexey.service.impl.GroupServiceImpl;
//import com.alexey.service.impl.UserServiceImpl;
//import com.alexey.service.impl.UserGroupLinkServiceImpl;
//import com.alexey.dal.entity.Group;
//import com.alexey.dal.entity.User;
//import com.alexey.dal.entity.UserGroupLink;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class TestUserGroupLinkServiceImpl {
//    @Test
//    public void testCreate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserServiceImpl.getInstance().create(user1, session);
//        Group group = new Group("group 001");
//        GroupServiceImpl.getInstance().create(group, session);
//        UserGroupLink userGroupLink = new UserGroupLink(1, 1);
//        UserGroupLinkServiceImpl.getInstance().create(userGroupLink, session);
//        session.close();
//    }
//
//    @Test
//    public void testRead() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserServiceImpl.getInstance().create(user1, session);
//        Group group = new Group("group 001");
//        GroupServiceImpl.getInstance().create(group, session);
//        UserGroupLink userGroupLink = new UserGroupLink(1, 1);
//        UserGroupLinkServiceImpl.getInstance().create(userGroupLink, session);
//        Assertions.assertEquals("UserGroupLink{id=1, userId=1, groupId=1}",
//                UserGroupLinkServiceImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testUpdate() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        User user2 = new User("Bob2", "Bobovich2", "Bob2@gmail.com", "222w2");
//        UserServiceImpl.getInstance().create(user1, session);
//        UserServiceImpl.getInstance().create(user2, session);
//        Group group1 = new Group("group 001");
//        Group group2 = new Group("group 002");
//        GroupServiceImpl.getInstance().create(group1, session);
//        GroupServiceImpl.getInstance().create(group2, session);
//        UserGroupLink userGroupLink1 = new UserGroupLink(1, 1);
//        UserGroupLinkServiceImpl.getInstance().create(userGroupLink1, session);
//        UserGroupLink userGroupLink2 = UserGroupLinkServiceImpl.getInstance().readById(1, session);
//        userGroupLink2.setUserId(2);
//        userGroupLink2.setGroupId(2);
//        UserGroupLinkServiceImpl.getInstance().update(userGroupLink2, session);
//        Assertions.assertEquals("UserGroupLink{id=1, userId=2, groupId=2}",
//                UserGroupLinkServiceImpl.getInstance().readById(1, session).toString());
//        session.close();
//    }
//
//    @Test
//    public void testDelete() {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
//        UserServiceImpl.getInstance().create(user1, session);
//        Group group = new Group("group 001");
//        GroupServiceImpl.getInstance().create(group, session);
//        UserGroupLink userGroupLink = new UserGroupLink(1, 1);
//        UserGroupLinkServiceImpl.getInstance().create(userGroupLink, session);
//        UserGroupLinkServiceImpl.getInstance().delete(userGroupLink, session);
//        Assertions.assertEquals(null, UserGroupLinkServiceImpl.getInstance().readById(1, session));
//        session.close();
//    }
//
//    @Test
//    public void testGetInstance() {
//        UserGroupLinkServiceImpl instance = UserGroupLinkServiceImpl.getInstance();
//        Assertions.assertEquals(instance, UserGroupLinkServiceImpl.getInstance());
//    }
//}
