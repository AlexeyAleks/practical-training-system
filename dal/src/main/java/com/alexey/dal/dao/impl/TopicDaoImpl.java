package com.alexey.dal.dao.impl;

import com.alexey.dal.dao.TopicDao;
import com.alexey.dal.entity.Topic;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TopicDaoImpl implements TopicDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public TopicDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Topic topic) {
        sessionFactory.getCurrentSession().saveOrUpdate(topic);
    }

    @Override
    public Topic readById(int id) {
        return sessionFactory.getCurrentSession().find(Topic.class, id);
    }

    @Override
    public void update(Topic topic) {
        sessionFactory.getCurrentSession().update(topic);
    }

    @Override
    public void delete(Topic topic) {
        sessionFactory.getCurrentSession().delete(topic);
    }
}
