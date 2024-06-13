package com.example.jpatest.entitymanager.board;

import com.example.jpatest.entitymanager.entity.BoardEntity;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
public class BoardDAOImplTest {
    @Autowired
    BoardDAO dao;
    @Test
    public void insertTest(){
        dao.insert(new BoardEntity("bts1","노래","test"));
        dao.insert(new BoardEntity("bts2","노래2","test2"));
        dao.insert(new BoardEntity("bts3","노래3","test3"));
    }
    @Test
    public void readTest(){
        BoardEntity board= dao.read("3");
        System.out.println(board);
    }
    @Test
    public void delTest(){
        dao.delete("3");
    }
    @Test
    public void updateTest(){
        dao.update(new BoardEntity(3L,"노래4","bts4"));
    }
    @Test
    public void listTest(){
        System.out.println(dao.list());
    }
}