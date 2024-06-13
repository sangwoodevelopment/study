package com.example.jpatest.entitymanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

//JPA가 관리하는 객체 - 테이블과 매핑되는 객체
@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name="pass")
    private String password;
    private String name;
    @CreationTimestamp
    private Date createDate;

    @UpdateTimestamp
    private Date modifyDate;
    private int checkVal;
    @Lob
    private String info;
    @Transient
    private String testval;

    public PersonEntity(String password, String name, int checkVal, String info) {
        this.password = password;
        this.name = name;
        this.checkVal = checkVal;
        this.info = info;
    }
}
