package com.alexey.dao;

public interface Dao<T> {
    void creat(T t);

    T readById(int id);

    void update(T t);

    void delete(T t);
}
