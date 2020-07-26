package com.alexey;

import com.alexey.dao.impl.UserDaoImpl;
import com.alexey.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StarterApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        User user1 = new User("Bob", "Bobovich", "Bob@gmail.com", "111w2");
        User user2 = new User("Elka", "Lesnik", "El@gmail.com", "x123y");

        UserDaoImpl.getInstance().create(user1, session);
        UserDaoImpl.getInstance().create(user2, session);

        User foundUser1 = UserDaoImpl.getInstance().readById(1, session);
        User foundUser2 = UserDaoImpl.getInstance().readById(2, session);
        System.out.println(foundUser1);
        System.out.println(foundUser2);

        foundUser1.setFirstName("Rob");
        foundUser1.setLastName("Robokovich");
        foundUser1.setEmail("Rob@gmail.com");
        foundUser1.setPassword("RRRw2");
        UserDaoImpl.getInstance().update(foundUser1, session);
        System.out.println(UserDaoImpl.getInstance().readById(1, session));

        UserDaoImpl.getInstance().delete(foundUser1, session);

        session.close();
    }
}
