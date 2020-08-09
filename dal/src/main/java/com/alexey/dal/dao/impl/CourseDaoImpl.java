package com.alexey.dal.dao.impl;

import com.alexey.dal.dao.CourseDao;
import com.alexey.dal.entity.Course;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseDaoImpl implements CourseDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public CourseDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Course course) {
        sessionFactory.getCurrentSession().saveOrUpdate(course);
    }

    @Override
    public Course readById(int id) {
        return sessionFactory.getCurrentSession().find(Course.class, id);
    }

    @Override
    public void update(Course course) {
        sessionFactory.getCurrentSession().update(course);
    }

    @Override
    public void delete(Course course) {
        sessionFactory.getCurrentSession().delete(course);
    }
}
