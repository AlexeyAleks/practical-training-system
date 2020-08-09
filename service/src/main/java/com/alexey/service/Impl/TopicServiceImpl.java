package com.alexey.service.Impl;

import com.alexey.dal.dao.impl.TopicDaoImpl;
import com.alexey.dal.entity.Topic;
import com.alexey.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TopicServiceImpl implements TopicService {
    private final TopicDaoImpl topicDao;

    @Autowired
    public TopicServiceImpl(TopicDaoImpl topicDao) {
        this.topicDao = topicDao;
    }

    @Override
    public void create(Topic topic) {
        topicDao.create(topic);
    }

    @Override
    public Topic readById(int id) {
        return topicDao.readById(id);
    }

    @Override
    public void update(Topic topic) {
        topicDao.update(topic);
    }

    @Override
    public void delete(Topic topic) {
        topicDao.delete(topic);
    }
}
