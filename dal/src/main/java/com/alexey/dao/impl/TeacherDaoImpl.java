package com.alexey.dao.impl;

import com.alexey.dao.TeacherDao;
import com.alexey.entity.Teacher;
import org.hibernate.Session;

public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void create(Teacher teacher, Session s) {

    }

    @Override
    public Teacher readById(int id, Session s) {
        return null;
    }

    @Override
    public void update(Teacher teacher, Session s) {

    }

    @Override
    public void delete(Teacher teacher, Session s) {

    }
}
