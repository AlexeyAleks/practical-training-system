package com.alexey.dao.impl;

import com.alexey.dao.GroupDao;
import com.alexey.entity.Group;
import org.hibernate.Session;

public class GroupDaoImpl implements GroupDao {
    @Override
    public void create(Group group, Session s) {

    }

    @Override
    public Group readById(int id, Session s) {
        return null;
    }

    @Override
    public void update(Group group, Session s) {

    }

    @Override
    public void delete(Group group, Session s) {

    }
}
