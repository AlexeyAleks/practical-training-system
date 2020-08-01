package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
@Service
@Getter
@Setter
public class Teacher extends User {

    @Column
    private String permission;

    @JoinColumn(name = "user_id")
    private int userId;

    public Teacher(String firstName, String lastName, String email, String password, String permission, int userId) {
        super(firstName, lastName, email, password);
        this.permission = permission;
        this.userId = userId;
    }

    public Teacher() {
    }
}
