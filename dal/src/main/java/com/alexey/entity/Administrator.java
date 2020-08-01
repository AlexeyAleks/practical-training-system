package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
//@PrimaryKeyJoinColumn(name = "id")
@Repository
@Getter
@Setter
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
}
