package com.alexey.service.impl;

import com.alexey.service.CourseService;
import com.alexey.entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CourseServiceImpl implements CourseService {
    private static CourseServiceImpl INSTANCE = null;

    public static CourseServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (CourseServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CourseServiceImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(Course course, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
    }

    @Override
    public Course readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        Course course = session.find(Course.class, id);
        transaction.commit();
        return course;
    }

    @Override
    public void update(Course course, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
    }

    @Override
    public void delete(Course course, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(course);
        transaction.commit();
    }
}
