package com.alexey.dao.impl;

import com.alexey.dao.TeacherDao;
import com.alexey.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeacherDaoImpl implements TeacherDao {
    private static TeacherDaoImpl INSTANCE = null;

    public static TeacherDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (TeacherDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TeacherDaoImpl();
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
