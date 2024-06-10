package com.example.mongo.dao;

import com.example.mongo.dto.ScoreDTO;

import java.util.List;

public interface ScoreMongoDAO {
	public List<ScoreDTO> findCriteria(String key, String value);
	public ScoreDTO findById(String key,String value);
	public void insertDocument(ScoreDTO doc);
	public void insertAllDocument(List<ScoreDTO> docs);
	public void update(ScoreDTO document);
	public void test1();
	public List<ScoreDTO> findAll();
	public List<ScoreDTO> findAll(int pageNo);
}
