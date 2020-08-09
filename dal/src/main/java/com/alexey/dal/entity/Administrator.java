package com.alexey.dal.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
@PrimaryKeyJoinColumn(name = "user_id")
@Getter
@Setter
@ToString(callSuper = true)
public class Administrator extends User {

    @Column
    private String permission;

    public Administrator(String firstName, String lastName, String email, String password,
                         String permission, String role) {
        super(firstName, lastName, email, password, role);
        this.permission = permission;
    }

    public Administrator() {
    }
}
