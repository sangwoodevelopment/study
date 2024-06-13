package com.example.jpatest.entitymanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name ="board")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
    @Id
    @GeneratedValue
    private Long boardNo;
    private String writer;
    private String title;
    //처음 데이터가 저장될때 시간을 저장
    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    private Date modifyDate;
    private String content;

    public BoardEntity(String writer, String title, String content) {
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

    public BoardEntity(Long boardNo, String title, String writer) {
        this.boardNo = boardNo;
        this.title = title;
        this.writer = writer;
    }
}


