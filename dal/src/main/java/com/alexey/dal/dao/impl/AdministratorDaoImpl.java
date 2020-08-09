package com.alexey.dal.dao.impl;

import com.alexey.dal.dao.AdministratorDao;
import com.alexey.dal.entity.Administrator;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AdministratorDaoImpl implements AdministratorDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public AdministratorDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Administrator administrator) {
        sessionFactory.getCurrentSession().saveOrUpdate(administrator);
    }

    @Override
    public Administrator readById(int id) {
        return sessionFactory.getCurrentSession().find(Administrator.class, id);
    }

    @Override
    public void update(Administrator administrator) {
        sessionFactory.getCurrentSession().update(administrator);
    }

    @Override
    public void delete(Administrator administrator) {
        sessionFactory.getCurrentSession().delete(administrator);
    }
}
