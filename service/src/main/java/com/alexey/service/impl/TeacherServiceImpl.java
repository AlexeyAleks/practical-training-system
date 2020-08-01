package com.alexey.service.impl;

import com.alexey.service.TeacherService;
import com.alexey.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeacherServiceImpl implements TeacherService {
    private static TeacherServiceImpl INSTANCE = null;

    public static TeacherServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (TeacherServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TeacherServiceImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(Teacher teacher, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(teacher);
        transaction.commit();
    }

    @Override
    public Teacher readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        Teacher teacher = session.find(Teacher.class, id);
        transaction.commit();
        return teacher;
    }

    @Override
    public void update(Teacher teacher, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(teacher);
        transaction.commit();
    }

    @Override
    public void delete(Teacher teacher, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(teacher);
        transaction.commit();
    }
}
