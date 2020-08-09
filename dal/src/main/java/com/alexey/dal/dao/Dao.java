package com.alexey.dal.dao;

public interface Dao<T> {
    void create(T t);

    T readById(int id);

    void update(T t);

    void delete(T t);
}
