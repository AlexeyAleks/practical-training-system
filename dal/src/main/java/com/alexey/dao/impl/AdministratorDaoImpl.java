package com.alexey.dao.impl;

import com.alexey.dao.AdministratorDao;
import com.alexey.entity.Administrator;
import org.hibernate.Session;

public class AdministratorDaoImpl implements AdministratorDao {
    @Override
    public void create(Administrator administrator, Session s) {

    }

    @Override
    public Administrator readById(int id, Session s) {
        return null;
    }

    @Override
    public void update(Administrator administrator, Session s) {

    }

    @Override
    public void delete(Administrator administrator, Session s) {

    }
}
