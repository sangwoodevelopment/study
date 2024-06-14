package com.example.jpatest.entitymanager.relation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="myhistory")
public class HistoryEntity {
    @Id
    @GeneratedValue
    private Long historyId;
    private String company;
    private String content;

    public HistoryEntity(String company, String content) {
        this.company = company;
        this.content = content;

    }
}
