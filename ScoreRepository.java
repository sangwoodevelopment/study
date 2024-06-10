package com.example.mongo.dao;

import com.example.mongo.dto.ScoreDTO;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ScoreRepository extends PagingAndSortingRepository<ScoreDTO,String> {

}
