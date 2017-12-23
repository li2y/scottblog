package com.blog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Li2 on 2017/12/23.
 */
@Entity
@Table(name = "t_manager")
public class Manager {
    @Id
    @GeneratedValue(generator = "uuid")  //id 使用UUID生成
    @GenericGenerator(name = "uuid",strategy = "uuid")
    private String id;

    @Column
    private String managerName;

    @Column
    private String password;

    @Column
    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
