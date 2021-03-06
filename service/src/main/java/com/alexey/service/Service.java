package com.alexey.service;

public interface Service<T> {
    void create(T t);

    T readById(int id);

    void update(T t);

    void delete(T t);
}
