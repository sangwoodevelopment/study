package com.example.jpatest.entitymanager.relation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="userInfo")
public class PrivateInfoEntity {
    @Id
    private String userInfoId;
    private String info1;
    private String info2;
}
