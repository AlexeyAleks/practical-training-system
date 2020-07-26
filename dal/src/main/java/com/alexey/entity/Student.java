package com.alexey.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
@PrimaryKeyJoinColumn(name = "id")
public class Student extends User {

    @Column
    private String permission;

    @JoinColumn(name = "user_id")
    private int userId;

    public Student() {
        super();
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
