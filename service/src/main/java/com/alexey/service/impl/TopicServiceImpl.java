package com.alexey.service.impl;

import com.alexey.service.TopicService;
import com.alexey.entity.Topic;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TopicServiceImpl implements TopicService {
    private static TopicServiceImpl INSTANCE = null;

    public static TopicServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (TopicServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TopicServiceImpl();
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
