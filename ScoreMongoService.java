package com.example.mongo.service;

import com.example.mongo.dto.ScoreDTO;

import java.util.List;

public interface ScoreMongoService {
	public ScoreDTO findById(String key, String value);
	public void insertDocument(ScoreDTO doc);
	public void insertAllDocument(List<ScoreDTO> docs);
	public List<ScoreDTO> findCriteria(String key,String value);
	public void update(ScoreDTO document);
	public void test1();
	public List<ScoreDTO> findAll();
	public List<ScoreDTO> findAll(int pageNo);
}
