package com.example.jpatest.entitymanager.board;

import com.example.jpatest.entitymanager.entity.BoardEntity;
import com.example.jpatest.entitymanager.entity.PersonEntity;

import java.util.List;

public interface BoardDAO {
    void insert(BoardEntity dto) ;
    BoardEntity read(String id);
    void delete(String id);
    void update(BoardEntity dto);
    List<BoardEntity> list();
}
