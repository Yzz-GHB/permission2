package com.edu.hbut.manage.permission.entity;

import com.edu.hbut.manage.permission.enumtype.PermissionType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

public class Permission {

    @Getter @Setter private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Getter @Setter private User user;

    @OneToOne
    @JoinColumn(name = "department_id")
    @Getter @Setter private Department department;

    @Enumerated(value = EnumType.ORDINAL)
    private PermissionType permissionType;

}
