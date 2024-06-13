package com.example.jpatest.entitymanager.board;

import com.example.jpatest.entitymanager.entity.BoardEntity;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class BoardDAOImpl implements BoardDAO{
    private final EntityManager entityManager;
    @Override
    public void insert(BoardEntity dto) {
        entityManager.persist(dto);
    }

    @Override
    public BoardEntity read(String boardNo) {
        return entityManager.find(BoardEntity.class,Long.parseLong(boardNo));
    }

    @Override
    public void delete(String boardNo) {
        BoardEntity board = entityManager.find(BoardEntity.class,Long.parseLong(boardNo));
        entityManager.remove(board);
    }

    @Override
    public void update(BoardEntity dto) {
        BoardEntity board = entityManager.find(BoardEntity.class,dto.getBoardNo());
        board.setTitle(dto.getTitle());
        board.setWriter(dto.getWriter());

    }

    @Override
    public List<BoardEntity> list() {
        List<BoardEntity> boardlist = entityManager.createQuery("select b from BoardEntity b",BoardEntity.class).getResultList();

        return boardlist;
    }
}
