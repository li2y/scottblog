package com.blog.entity;

import javax.persistence.*;

/**
 * Created by Li2 on 2017/12/23.
 */
@Entity
@Table(name = "blog_user")
public class User {
    @Id
    @Column
    private String id;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
