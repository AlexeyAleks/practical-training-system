package com.alexey.service.Impl;

import com.alexey.dal.dao.impl.CourseDaoImpl;
import com.alexey.dal.entity.Course;
import com.alexey.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    private final CourseDaoImpl courseDao;

    @Autowired
    public CourseServiceImpl(CourseDaoImpl courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void create(Course course) {
        courseDao.create(course);
    }

    @Override
    public Course readById(int id) {
        return courseDao.readById(id);
    }

    @Override
    public void update(Course course) {
        courseDao.update(course);
    }

    @Override
    public void delete(Course course) {
        courseDao.delete(course);
    }
}
