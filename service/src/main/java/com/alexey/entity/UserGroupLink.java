package com.alexey.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "user_group_link")
@Service
@Getter
@Setter
public class UserGroupLink {
    @Id
    @Column(name = "user_group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    int userId;

    @Column(name = "group_id")
    int groupId;

    public UserGroupLink(int userId, int groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public UserGroupLink() {
    }

    @Override
    public String toString() {
        return "UserGroupLink{" +
                "id=" + id +
                ", userId=" + userId +
                ", groupId=" + groupId +
                '}';
    }
}
