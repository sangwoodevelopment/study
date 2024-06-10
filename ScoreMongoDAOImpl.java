package com.example.mongo.dao;

import com.example.mongo.dto.ScoreDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class ScoreMongoDAOImpl implements ScoreMongoDAO{
    private final ScoreRepository repository;
    private final MongoTemplate mongoTemplate;
    @Override
    public List<ScoreDTO> findCriteria(String key, String value) {
        return List.of();
    }

    @Override
    public ScoreDTO findById(String key, String value) {
        return null;
    }

    @Override
    public void insertDocument(ScoreDTO doc) {
        mongoTemplate.insert(doc);
    }

    @Override
    public void insertAllDocument(List<ScoreDTO> docs) {
        mongoTemplate.insertAll(docs);
    }

    @Override
    public void update(ScoreDTO document) {

    }

    @Override
    public void test1() {

    }

    @Override
    public List<ScoreDTO> findAll() {
        System.out.println("========================");
        List<ScoreDTO> list = mongoTemplate.findAll(ScoreDTO.class,"score");
        return list;
    }

    @Override
    public List<ScoreDTO> findAll(int pageNo) {
        //PagingAndSortingRepository의 findAll메소드를 호출하면 페이징 처리가 된 객체를 전달받을 수 있다
        //PagingAndSortingRepository의 findAll메소드 내부에서 페이징처리를 자동으로 구현해준다

        //pageNo => 몇 번째 페이지인지
        //pageSize => 한 페이지에 출력할 도큐먼트의 갯수
        Sort sort = Sort.by("property").ascending();//오름차순정렬
        Page<ScoreDTO> page = repository.findAll(PageRequest.of(pageNo,10,sort));
        return page.getContent();
    }
}
