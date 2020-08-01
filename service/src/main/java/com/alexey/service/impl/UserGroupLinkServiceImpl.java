package com.alexey.service.impl;

import com.alexey.service.UserGroupLinkService;
import com.alexey.entity.UserGroupLink;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserGroupLinkServiceImpl implements UserGroupLinkService {

    private static UserGroupLinkServiceImpl INSTANCE = null;

    public static UserGroupLinkServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (UserGroupLinkServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserGroupLinkServiceImpl();
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
