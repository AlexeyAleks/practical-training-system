package com.alexey.service.impl;

import com.alexey.service.GroupService;
import com.alexey.entity.Group;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GroupServiceImpl implements GroupService {
    private static GroupServiceImpl INSTANCE = null;

    public static GroupServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (GroupServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new GroupServiceImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(Group group, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(group);
        transaction.commit();
    }

    @Override
    public Group readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        Group group = session.find(Group.class, id);
        transaction.commit();
        return group;
    }

    @Override
    public void update(Group administrator, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(administrator);
        transaction.commit();
    }

    @Override
    public void delete(Group groupDao, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(groupDao);
        transaction.commit();
    }
}
