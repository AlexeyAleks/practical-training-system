package com.alexey.dao.impl;

import com.alexey.dao.TopicDao;
import com.alexey.entity.Topic;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TopicDaoImpl implements TopicDao {
    private static TopicDaoImpl INSTANCE = null;

    public static TopicDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (TopicDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TopicDaoImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(Topic topic, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(topic);
        transaction.commit();
    }

    @Override
    public Topic readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        Topic topic = session.find(Topic.class, id);
        transaction.commit();
        return topic;
    }

    @Override
    public void update(Topic topic, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(topic);
        transaction.commit();
    }

    @Override
    public void delete(Topic topic, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(topic);
        transaction.commit();
    }
}
