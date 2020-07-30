package com.alexey.dao.impl;

import com.alexey.dao.UserGroupLinkDao;
import com.alexey.entity.UserGroupLink;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserGroupLinkDaoImpl implements UserGroupLinkDao {

    private static UserGroupLinkDaoImpl INSTANCE = null;

    public static UserGroupLinkDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (UserGroupLinkDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserGroupLinkDaoImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(UserGroupLink userGroupLink, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(userGroupLink);
        transaction.commit();
    }

    @Override
    public UserGroupLink readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        UserGroupLink userGroupLink = session.find(UserGroupLink.class, id);
        transaction.commit();
        return userGroupLink;
    }

    @Override
    public void update(UserGroupLink userGroupLink, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(userGroupLink);
        transaction.commit();
    }

    @Override
    public void delete(UserGroupLink userGroupLink, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(userGroupLink);
        transaction.commit();
    }
}
