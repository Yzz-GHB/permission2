package com.edu.hbut.manage.permission.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "user")
public class User {

    @Getter @Setter private long id;

    private String name;

    @OneToMany(mappedBy = "user")
    @Getter @Setter private List<Permission> permissions;

}
