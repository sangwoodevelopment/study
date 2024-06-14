package com.example.jpatest.entitymanager.relation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class EmpEntityTest {
    //JPA에 스펙에서 제공하는 기능을 제대로 사용할 수 있도록 제공
    //@Autowired와 같은 역활도 수행
    //@PersistenceContext는 EntityManager를 빈으로 주입할때 사용하는 어노테이션
    @PersistenceContext
    EntityManager entityManager;
    @Test
    public void test1(){
        PrivateInfoEntity privateInfo1 =
                new PrivateInfoEntity("bts1","태양과 듀엣","솔로");
        PrivateInfoEntity privateInfo2 =
                new PrivateInfoEntity("bts2","Seven","올림픽곡");
        PrivateInfoEntity privateInfo3 =
                new PrivateInfoEntity("bts3","춤모야","조교");
        PrivateInfoEntity privateInfo4 =
                new PrivateInfoEntity("bts4","제대했다","너무해");
        PrivateInfoEntity privateInfo5 =
                new PrivateInfoEntity("kbr","싱어송라이터","바람바람바람");


        EmpEntity emp1 = new EmpEntity("bts1","지민","광주",privateInfo1);
        EmpEntity emp2 = new EmpEntity("bts2","정국","부산",privateInfo2);
        EmpEntity emp3 = new EmpEntity("bts3","제이홉","광주",privateInfo3);
        EmpEntity emp4 = new EmpEntity("bts4","석진","천안",privateInfo4);
        EmpEntity emp5 = new EmpEntity("kbr","범룡","청주",privateInfo5);

        entityManager.persist(emp1);
        entityManager.persist(emp2);
        entityManager.persist(emp3);
        entityManager.persist(emp4);
        entityManager.persist(emp5);
    }
    @Test
    public void readtest1(){
        EmpEntity emp = entityManager.find(EmpEntity.class,"bts4");
        System.out.println();
    }
    @Test
    public void test2(){
        //경력사항, emp기본정보, 시크릿정보 모두 저장하기
        List<HistoryEntity> historyEntityList = new ArrayList<>();
        historyEntityList.add(new HistoryEntity("A사","front react개발"));
        historyEntityList.add(new HistoryEntity("B사","Entity개발"));
        historyEntityList.add(new HistoryEntity("C사","보안개발"));

        EmpEntity emp = new EmpEntity("bts7","슈가","대구",new PrivateInfoEntity("bts7","화양연화","래퍼"),
                historyEntityList);
        entityManager.persist(emp);
    }
    @Test
    public void readtest2(){
        EmpEntity emp = entityManager.find(EmpEntity.class,"bts7");
        System.out.println();
    }
    @Test
    public void test3(){
        //부서, 기본정보, 시크릿, 히스토리
        DeptEntity dept1 = new DeptEntity("전산실","조상우");
        entityManager.persist(dept1);

        //경력
        List<HistoryEntity> historyEntityList = new ArrayList<>();
        historyEntityList.add(new HistoryEntity("A사","front react개발"));
        historyEntityList.add(new HistoryEntity("B사","Entity개발"));
        historyEntityList.add(new HistoryEntity("C사","보안개발"));
        //사원정보
        EmpEntity emp = new EmpEntity("bts7","슈가","대구",new PrivateInfoEntity("bts7","화양연화","래퍼"),
                historyEntityList,dept1);
        entityManager.persist(emp);
    }
    @Test
    public void readtest3(){
        EmpEntity empEntity = entityManager.find(EmpEntity.class,"bts7");
        System.out.println(empEntity);
    }
}