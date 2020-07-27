package com.alexey.dao.impl;

import com.alexey.dao.StudentDao;
import com.alexey.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDaoImpl implements StudentDao {
    private static StudentDaoImpl INSTANCE = null;

    public static StudentDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (StudentDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new StudentDaoImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(Student student, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }

    @Override
    public Student readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        Student student = session.find(Student.class, id);
        transaction.commit();
        return student;
    }

    @Override
    public void update(Student student, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
    }

    @Override
    public void delete(Student student, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
    }
}
