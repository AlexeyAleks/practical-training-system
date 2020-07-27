package com.alexey.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@PrimaryKeyJoinColumn(name = "id")
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
