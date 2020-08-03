package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
@Service
@Getter
@Setter
public class Administrator extends User {

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
}
