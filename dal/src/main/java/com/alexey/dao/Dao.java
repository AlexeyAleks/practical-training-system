package com.alexey.dao;


import org.hibernate.Session;

public interface Dao<T> {
    void create(T t, Session s);

    T readById(int id, Session s);

    void update(T t, Session s);

    void delete(T t, Session s);
}