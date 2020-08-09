package com.alexey.service.Impl;

import com.alexey.dal.dao.impl.GroupDaoImpl;
import com.alexey.dal.entity.Group;
import com.alexey.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {
    private final GroupDaoImpl groupDao;

    @Autowired
    public GroupServiceImpl(GroupDaoImpl groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    public void create(Group group) {
        groupDao.create(group);
    }

    @Override
    public Group readById(int id) {
        return groupDao.readById(id);
    }

    @Override
    public void update(Group group) {
        groupDao.update(group);
    }

    @Override
    public void delete(Group group) {
        groupDao.delete(group);
    }
}
