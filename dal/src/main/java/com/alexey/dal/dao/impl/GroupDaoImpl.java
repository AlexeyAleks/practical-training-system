package com.alexey.dal.dao.impl;

import com.alexey.dal.dao.GroupDao;
import com.alexey.dal.entity.Group;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupDaoImpl implements GroupDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public GroupDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Group group) {
        sessionFactory.getCurrentSession().saveOrUpdate(group);
    }

    @Override
    public Group readById(int id) {
        return sessionFactory.getCurrentSession().find(Group.class, id);
    }

    @Override
    public void update(Group group) {
        sessionFactory.getCurrentSession().update(group);
    }

    @Override
    public void delete(Group group) {
        sessionFactory.getCurrentSession().delete(group);
    }
}
