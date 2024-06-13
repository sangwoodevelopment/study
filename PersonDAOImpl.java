package com.example.jpatest.entitymanager.person;

import com.example.jpatest.entitymanager.entity.PersonEntity;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class PersonDAOImpl implements PersonDAO{

    private final EntityManager entityManager;
    @Override
    public void insert(PersonEntity dto) {
        //
        System.out.println("persist메소드 호출 전");
        entityManager.persist(dto);
        entityManager.persist(dto);
        entityManager.persist(dto);
        entityManager.persist(new PersonEntity("2222","석진",10000,"test"));
        System.out.println("===========================================================");
        //캐시를 비운다
//        entityManager.clear();
        //db에서 저장된 레코드를 조회하는 작업
        //select * from person where id = 1
        //캐시에 저장되어 있는 객체가 있으면 디비에서 조회하지 않고 캐시에서 객체를 꺼내온다
        PersonEntity data = entityManager.find(PersonEntity.class,dto.getId());

    }

    @Override
    public PersonEntity read(String id) {
        return null;
    }

    @Override
    public void delete(String id) {
        PersonEntity person = entityManager.find(PersonEntity.class,Long.parseLong(id));
        System.out.println("====================삭제전==================");
    }

    @Override
    public void update(PersonEntity dto) {
        PersonEntity person = entityManager.find(PersonEntity.class,dto.getId());
        person.setPassword(dto.getPassword());
        person.setInfo(dto.getInfo());
    }
    /*
        JPA는 내부에서 객체지향 쿼리를 사용해서 조회
        객체지향쿼리 - JPQL
        JPQL을 이용하면 이미 셋팅되어 있는 테이블에 맞춰서 쿼리가 만들어진다
        복잡한 검색 조건이나 조건이 들어가 있는 경우 적용이 가능
        select, from, where, group by, having join지원가능
     */
    @Override
    public List<PersonEntity> list() {
        List<PersonEntity> list = entityManager.createQuery("select p from PersonEntity as P", PersonEntity.class).getResultList();
        return list;
    }
}
