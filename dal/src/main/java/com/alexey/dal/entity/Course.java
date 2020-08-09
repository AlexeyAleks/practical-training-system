package com.alexey.dal.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
@PrimaryKeyJoinColumn(name = "group_id")
@Data
public class Course {
    @OneToMany
    @JoinColumn(name = "course_id")
    private List<Topic> topicList = new ArrayList<>();

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column(name = "group_id")
    private int groupId;

    public Course(String name, int groupId) {
        this.name = name;
        this.groupId = groupId;
    }

    public Course() {
    }
}
