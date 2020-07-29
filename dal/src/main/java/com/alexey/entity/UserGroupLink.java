package com.alexey.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_group_link")
public class UserGroupLink {
    @Id
    @Column
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
