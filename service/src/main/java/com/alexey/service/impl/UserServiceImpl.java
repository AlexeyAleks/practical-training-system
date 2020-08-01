package com.alexey.service.impl;

import com.alexey.service.UserService;
import com.alexey.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserServiceImpl implements UserService {

    private static UserServiceImpl INSTANCE = null;

    public static UserServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (UserServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserServiceImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(User user, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
    }

    @Override
    public User readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        User user = session.find(User.class, id);
        transaction.commit();
        return user;
    }

    @Override
    public void update(User user, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
    }

    @Override
    public void delete(User user, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
    }
}
