package com.alexey.service.impl;

import com.alexey.service.AdministratorService;
import com.alexey.entity.Administrator;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdministratorServiceImpl implements AdministratorService {

    private static AdministratorServiceImpl INSTANCE = null;

    public static AdministratorServiceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (AdministratorServiceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AdministratorServiceImpl();
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
