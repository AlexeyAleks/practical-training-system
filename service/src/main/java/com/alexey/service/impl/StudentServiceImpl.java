package com.alexey.service.impl;

import com.alexey.service.StudentService;
import com.alexey.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentServiceImpl implements StudentService {
    private static StudentServiceImpl INSTANCE = null;

    public static StudentServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (StudentServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new StudentServiceImpl();
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
