package com.example.jpatest.entitymanager.person;

import com.example.jpatest.entitymanager.entity.PersonEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
//테스트작업 시 롤백되지 않도록 정의
@Rollback(value = false)
//하나의 메소드
class PersonDAOImplTest {
    @Autowired
    PersonDAO dao;
    @Test
    public void test(){
    System.out.println("++++++++++++++++++++++++++++++++++++=");
    dao.insert(new PersonEntity("1234","bts",100,"기타"));
    }
    @Test
    public void readTest(){
        dao.read("3");
    }
    @Test
    public void delTest() {
        dao.delete("3");
    }
}