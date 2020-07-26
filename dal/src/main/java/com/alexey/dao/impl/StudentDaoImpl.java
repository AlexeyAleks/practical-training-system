package com.alexey.dao.impl;

import com.alexey.dao.StudentDao;
import com.alexey.entity.Student;
import org.hibernate.Session;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void create(Student student, Session s) {

    }

    @Override
    public Student readById(int id, Session s) {
        return null;
    }

    @Override
    public void update(Student student, Session s) {

    }

    @Override
    public void delete(Student student, Session s) {

    }
}
