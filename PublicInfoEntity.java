package com.example.jpatest.entitymanager.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@MappedSuperclass
public class PublicInfoEntity {
    @CreationTimestamp
    private Date createionDate;
    @UpdateTimestamp
    private Date updateDate;
}
