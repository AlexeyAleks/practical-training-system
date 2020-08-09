package com.alexey.dal.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "topic")
@PrimaryKeyJoinColumn(name = "course_id")
@Data
public class Topic {
    @Id
    @Column(name = "topic_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String content;

    @Column(name = "course_id")
    private int courseId;

    public Topic(String name, String content, int courseId) {
        this.name = name;
        this.content = content;
        this.courseId = courseId;
    }

    public Topic() {
    }
}
