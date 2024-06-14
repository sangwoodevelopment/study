package com.example.jpatest.entitymanager.relation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mydept")
public class DeptEntity {
    @Id
    @GeneratedValue
    @Column(name = "deptNo")
    private Long id;
    private String name;
    private String mgr;

    public DeptEntity(String name, String mgr) {
        this.name = name;
        this.mgr = mgr;
    }
}
