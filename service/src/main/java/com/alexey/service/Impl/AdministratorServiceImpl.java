package com.alexey.service.Impl;

import com.alexey.dal.dao.impl.AdministratorDaoImpl;
import com.alexey.dal.entity.Administrator;
import com.alexey.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService {
    private final AdministratorDaoImpl administratorDao;

    @Autowired
    public AdministratorServiceImpl(AdministratorDaoImpl administratorDao) {
        this.administratorDao = administratorDao;
    }

    @Override
    public void create(Administrator administrator) {
        administratorDao.create(administrator);
    }

    @Override
    public Administrator readById(int id) {
        return administratorDao.readById(id);
    }

    @Override
    public void update(Administrator administrator) {
        administratorDao.update(administrator);
    }

    @Override
    public void delete(Administrator administrator) {
        administratorDao.delete(administrator);
    }
}
