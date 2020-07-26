package com.alexey.dao.impl;

import com.alexey.dao.TopicDao;
import com.alexey.entity.Topic;
import org.hibernate.Session;

public class TopicDaoImpl implements TopicDao {
    @Override
    public void create(Topic topic, Session s) {

    }

    @Override
    public Topic readById(int id, Session s) {
        return null;
    }

    @Override
    public void update(Topic topic, Session s) {

    }

    @Override
    public void delete(Topic topic, Session s) {

    }
}
