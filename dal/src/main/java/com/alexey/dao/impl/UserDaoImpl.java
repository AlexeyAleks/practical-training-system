package com.alexey.dao.impl;

import com.alexey.dao.UserDao;
import com.alexey.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {

    private static UserDaoImpl INSTANCE = null;

    public static UserDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (UserDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserDaoImpl();
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
    public User readById(int id,  Session session) {
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
