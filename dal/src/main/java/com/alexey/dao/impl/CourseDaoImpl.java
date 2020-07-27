package com.alexey.dao.impl;

import com.alexey.dao.CourseDao;
import com.alexey.entity.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CourseDaoImpl implements CourseDao {
    private static CourseDaoImpl INSTANCE = null;

    public static CourseDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (CourseDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CourseDaoImpl();
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
