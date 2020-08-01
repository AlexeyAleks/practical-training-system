package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "topic")
@Service
@Getter
@Setter
public class Topic {
    @Id
    @Column
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

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
