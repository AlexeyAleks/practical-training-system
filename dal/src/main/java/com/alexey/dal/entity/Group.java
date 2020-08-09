package com.alexey.dal.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`group`")
@Data
public class Group {
    @ManyToMany(mappedBy = "groupList")
    private List<User> userList = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "group_id")
    private List<Course> courseList = new ArrayList<>();

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }
}
