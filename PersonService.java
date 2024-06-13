package com.example.jpatest.entitymanager.person;

import com.example.jpatest.entitymanager.entity.PersonEntity;

import java.util.List;

public interface PersonService {
	void insert(PersonEntity dto) ;
	PersonEntity read(String id);
	void delete(String id);
	void update(PersonEntity dto);
	List<PersonEntity> list();
}
