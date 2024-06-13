package com.example.jpatest.entitymanager.person;


import com.example.jpatest.entitymanager.entity.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService{
    private final PersonDAO dao;
    @Override
    public void insert(PersonEntity dto) {
        dao.insert(dto);
    }

    @Override
    public PersonEntity read(String id) {
        return dao.read(id);
    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }

    @Override
    public void update(PersonEntity dto) {
        dao.update(dto);
    }

    @Override
    public List<PersonEntity> list() {
        return List.of();
    }

}
