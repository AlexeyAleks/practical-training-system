package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "`group`")
@Repository
@Getter
@Setter
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

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
