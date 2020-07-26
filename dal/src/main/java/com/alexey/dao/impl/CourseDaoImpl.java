package com.alexey.dao.impl;

import com.alexey.dao.CourseDao;
import com.alexey.entity.Course;
import org.hibernate.Session;

public class CourseDaoImpl implements CourseDao {
    @Override
    public void create(Course course, Session s) {

    }

    @Override
    public Course readById(int id, Session s) {
        return null;
    }

    @Override
    public void update(Course course, Session s) {

    }

    @Override
    public void delete(Course course, Session s) {

    }
}
