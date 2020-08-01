package com.alexey.entity;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
//@PrimaryKeyJoinColumn(name = "id")
public class Administrator extends User {

    @Id
    @Column(name = "administrator_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String permission;

    @JoinColumn(name = "user_id")
    private int userId;

    public Administrator(String firstName, String lastName, String email, String password,
                         String permission, int userId) {
        super(firstName, lastName, email, password);
        this.permission = permission;
        this.userId = userId;
    }

    public Administrator() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
