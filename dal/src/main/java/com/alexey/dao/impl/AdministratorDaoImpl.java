package com.alexey.dao.impl;

import com.alexey.dao.AdministratorDao;
import com.alexey.entity.Administrator;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdministratorDaoImpl implements AdministratorDao {

    private static AdministratorDaoImpl INSTANCE = null;

    public static AdministratorDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (AdministratorDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AdministratorDaoImpl();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void create(Administrator administrator, Session session) {
        Transaction transaction = session.beginTransaction();
        session.save(administrator);
        transaction.commit();
    }

    @Override
    public Administrator readById(int id, Session session) {
        Transaction transaction = session.beginTransaction();
        Administrator administrator = session.find(Administrator.class, id);
        transaction.commit();
        return administrator;
    }

    @Override
    public void update(Administrator administrator, Session session) {
        Transaction transaction = session.beginTransaction();
        session.update(administrator);
        transaction.commit();
    }

    @Override
    public void delete(Administrator administrator, Session session) {
        Transaction transaction = session.beginTransaction();
        session.delete(administrator);
        transaction.commit();
    }
}
