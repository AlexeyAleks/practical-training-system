package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "student")
//@PrimaryKeyJoinColumn(name = "id")
@Repository
@Getter
@Setter
public class Student extends User {

    @Column
    private String permission;

    @JoinColumn(name = "user_id")
    private int userId;

    public Student(String firstName, String lastName, String email, String password, String permission, int userId) {
        super(firstName, lastName, email, password);
        this.permission = permission;
        this.userId = userId;
    }

    public Student() {
    }
}
