package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
@Service
@Getter
@Setter
public class Course {
    @OneToMany
    @JoinColumn(name = "course_id")
    private List<Topic> topicList = new ArrayList<>();

    @Id
    @Column
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
